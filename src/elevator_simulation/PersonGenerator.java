/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elevator_simulation;

import java.util.Random;

/**
 *
 * @author Alex
 */
public class PersonGenerator {
    
    private int personID = 1;
    
    PersonGenerator(){
        
    }
    
    public Person createPerson(){
        Random rand = new Random();
        int r = rand.nextInt(Config.numFloors) + 1;
        int q;
        do{
            q = rand.nextInt(Config.numFloors) + 1;
        }while(q==r);
        int rStart = r;
        int rEnd = q;
        
        Person p = new Person(personID,rStart,rEnd,Config.clock.getTime()); //creates person with random start and end floors and start time
        
        personID++; //increment personID to maintain unique identities     
        return p;
    }
    
    public int getTotalPeople(){
        return personID;
    }
    
    public boolean shouldMakePerson(){
        Random rand = new Random();
        int sure = rand.nextInt(10);
        
        if(sure %2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
