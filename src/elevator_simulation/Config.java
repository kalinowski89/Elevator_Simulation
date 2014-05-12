/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator_simulation;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;


public class Config {
public static int numFloors;
public static int numElevators;
public static int numPeople;
public static Clock clock = new Clock();

Config(){
        String response = JOptionPane.showInputDialog("Enter number of Floors");
        int floors = Integer.parseInt(response);
        numFloors = floors;
        response = JOptionPane.showInputDialog("Enter number of Elevators");
        int elevators = Integer.parseInt(response);
        numElevators = elevators;
        
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
