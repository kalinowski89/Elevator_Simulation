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
    
    private int personID = 0;
    
    PersonGenerator(){
        
    }
    
    public Person createPerson(){
        Random rand = new Random();
        int r = rand.nextInt(10) + 1;
        int q;
        do{
            q = rand.nextInt(10) + 1;
        }while(q==r);
        int rStart = r;
        int rEnd = q;
        
        Person p = new Person(personID,rStart,rEnd); //creates person with random start and end floors
        
        personID++; //increment personID to maintain unique identities     
        return p;
    }
    
    public int getTotalPeople(){
        return personID;
    }
}
