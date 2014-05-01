
package elevator_simulation;

import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * Alex Kalinowski
 * Mar 6, 2014
 */

public class Floor {
    private ElevatorButton up,down;
    private int floorNum;
    private PriorityQueue<Person> upQ; //for ppl remaining use .size()
    private PriorityQueue<Person> downQ;
    
    Floor(int num){
        floorNum = num; // number of the floor
        up.setFloor(floorNum); //sets the floor number of the button
        down.setFloor(floorNum); //" "
        upQ = new PriorityQueue(); //creates up and down queue
        downQ = new PriorityQueue();
        
    }
    
    
    public void addPerson(Person person){ //give queue you wish to add to and the person
        if(person.getEndFloor()>person.getStartFloor()){
            this.upQ.offer(person);
        }
        else{
            this.downQ.offer(person);
        }
    }
    
    public Person subtractPerson(PriorityQueue<Person> q){
       return q.poll();
    }

}
