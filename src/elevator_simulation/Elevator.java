
package elevator_simulation;
/**
 * Alex Kalinowski
 * Mar 6, 2014
 */

public class Elevator {
    private int currentFloor, maxPassengers;
    private Person[] people;
    private ElevatorButton[] buttons;
    private int peopleInElevator;
    
    
    Elevator(int MAX_FLOORS, int MAX_PEOPLE){
        currentFloor =1;
        maxPassengers = MAX_PEOPLE;
        people = new Person[MAX_PEOPLE];
        buttons = new ElevatorButton[MAX_FLOORS];
    }
    
    public void getOn(Person p){
        people[peopleInElevator] = p;
        buttons[p.getEndFloor()].setStatus(1);
        peopleInElevator++;
    }
    
    public Person getOff(){
       peopleInElevator--;
       return people[peopleInElevator];
    }
}
