/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elevator_simulation;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
    public class Simulation
{
    /** pseudocode for simulation supervisor class */
 
void run()
{       boolean done = false;//however you are deciding to end
        Config config = new Config();
        String response = JOptionPane.showInputDialog("Enter number of Floors");
        int floors = Integer.parseInt(response);
        config.setNumFloors(floors);
        response = JOptionPane.showInputDialog("Enter number of Elevators");
        int elevators = Integer.parseInt(response);
        config.setNumElevators(elevators);
 
        Building building = new Building (config.getNumFloors(),config.getNumElevators());//instantiate the building of a given number of floors
        PersonGenerator personGenerator = new PersonGenerator();
       //GUIDisplay SimDusplay = new GUIDisplay();
//main loop

         
}             
}
