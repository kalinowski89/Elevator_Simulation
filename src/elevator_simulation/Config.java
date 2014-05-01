/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator_simulation;


public class Config {
private int numFloors;
private int numElevators;
private int numPeople;

Config(){
    numFloors = 1;
    numElevators = 1;
}

public void initialize(){
    
}
public int getNumFloors(){
    return numFloors;
}

public void setNumFloors(int numFloors){
    this.numFloors = numFloors;
}

public int getNumElevators(){
    return numElevators;
}

public void setNumElevators(int numElevators){
    this.numElevators = numElevators;
}

public void setNumPeople(int numPeople){
    this.numPeople = numPeople;
}

public int getNumPeople(){
    return numPeople;
}
}
