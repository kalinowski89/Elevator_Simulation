/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator_simulation;


public class ElevatorButton {
private int status;
private int floor;

ElevatorButton(){
    status = 0; //0 = off 1 = on
    floor = 1;
}

public int getStatus(){
    return status;
}

public void setStatus(int status){
    this.status = status;
}

public int getFloor(){
    return floor;
}

public void setFloor(int floor){
    this.floor = floor;
}
}
