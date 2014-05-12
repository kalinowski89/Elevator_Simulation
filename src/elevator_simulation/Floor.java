
package elevator_simulation;


import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Alex Kalinowski
 * Mar 6, 2014
 */

public class Floor {
    private ElevatorButton up,down;
    private int floorNum;
    private Queue<Person> upQ; //for ppl remaining use .size()
    private Queue<Person> downQ;
    
    Floor(int num){
        floorNum = num; // number of the floor
        up = new ElevatorButton(num);
        down = new ElevatorButton(num);
        upQ = new LinkedList(); //creates up and down queue
        downQ = new LinkedList();
        
    }
    
    
    public void addPerson(Person p){ //give queue you wish to add to and the person
        if(p.getEndFloor()>p.getStartFloor()){
            this.upQ.offer(p);
            this.up.setStatus(1);
        }
        else{
            this.downQ.offer(p);
            this.down.setStatus(1);
        }
    }
    
    public Person subtractPerson(PriorityQueue<Person> q){
       return q.poll();
    }
    
    public void setFloor(int num){
        this.floorNum = num;
    }
}
