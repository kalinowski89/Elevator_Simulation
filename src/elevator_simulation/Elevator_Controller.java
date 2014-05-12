/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elevator_simulation;

/**
 *
 * @author Alex
 */
public class Elevator_Controller {
    
    public Elevator_Controller(){
        
    }
    public boolean goingUp(Elevator e){
        for(int i = 0; i<Config.numFloors; i++){
         if(e.buttons[i].getStatus() == 1){
             if(e.getFloor()<e.buttons[i].getFloor()){
                 return true;
                }
            }
        }
        return false;
    }
    
    public boolean goingDown(Elevator e){
        
    for(int i = 0; i<Config.numFloors; i++){
         if(e.buttons[i].getStatus() == 1){
            if(e.getFloor()>e.buttons[i].getFloor()){
                return true;
             }
         }
    }
        return false;
    }
}
