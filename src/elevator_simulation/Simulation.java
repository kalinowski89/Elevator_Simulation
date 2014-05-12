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
        Building building = new Building (Config.numFloors,config.numElevators);//instantiate the building of a given number of floors
        PersonGenerator personGenerator = new PersonGenerator();
        Window window = new Window();
        window.setVisible(true);
       //GUIDisplay SimDusplay = new GUIDisplay();
//main loop
         
        do{
          if(personGenerator.shouldMakePerson()==true){
              Person person = personGenerator.createPerson();
              building.addPerson(person);///
          }
          building.moveElevator();//Buidling will decide where elevator goes, move it,
          //get people on & off
          //decide if you should continue
          
          config.clock.tick();
        } while (!done);//end while(!done)
         
}             
}
