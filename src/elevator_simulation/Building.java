/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elevator_simulation;

import java.util.HashSet;

/**
 *
 * @author Alex
 */
public class Building {
    public int elevatorTotal, floorTotal; //THESE HAVE TO BE ARRAYS
    public Floor[] floors;
    public Elevator[] elevators;    
    public Elevator_Controller controller = new Elevator_Controller();
    //
    
    Building(){
        
    }
    
    Building(int floor, int elevator){
        this.elevatorTotal = elevator;
        this.floorTotal = floor;
        floors = new Floor[floor];
        elevators = new Elevator[elevator];
        
        for(int i = 0 ; i<floor; i++){
            floors[i] = new Floor(i+1);
        }
        
        for(int i = 0 ; i<elevator; i++){
            elevators[i] = new Elevator(i+1);
        }
        
        
    }
    
    public void addPerson(Person p){
         floors[p.getStartFloor()-1].addPerson(p);
    }
    
    public void moveElevator(){ //maybe pass an elevator as parameter
        for(int i = 0 ; i<elevators.length; i++){
            
            if(controller.goingUp(elevators[i])==true){
                elevators[i].setFloor(elevators[i].getFloor()+1);
                
            }
            if(controller.goingDown(elevators[i])==true){
                elevators[i].setFloor(elevators[i].getFloor()-1);
            }
            
            
        }
    }
}
