
package elevator_simulation;
/**
 * Alex Kalinowski
 * Mar 6, 2014
 */

public class Elevator {
    private int currentFloor, maxPassengers;
    public Person[] people;
    public ElevatorButton[] buttons;
    public int peopleInElevator;
    
    
    Elevator(int floor){
        currentFloor =floor;
        maxPassengers = 20;
        people = new Person[20];
        buttons = new ElevatorButton[Config.numFloors];
        
        for(int i = 0; i< Config.numFloors; i++){
            buttons[i] = new ElevatorButton(i+1);
        }
    }
    
    public void getOn(Person p){
        if(!this.isFull()){
        people[peopleInElevator] = p;
        buttons[p.getEndFloor()].setStatus(1);
        peopleInElevator++;
        }
    }
    
    public Person getOff(){
       peopleInElevator--;
       return people[peopleInElevator];
    }
    
    public boolean isEmpty(){
        if(peopleInElevator == 0){
            return true;
        }
        
        return false;
    }
    
    public int getFloor(){
        return this.currentFloor;
    }

    public void setFloor(int floor){
        this.currentFloor = floor;
    }

    public boolean isFull(){
        if(peopleInElevator == 20){
            return true;
        }
        return false;
    }
}

