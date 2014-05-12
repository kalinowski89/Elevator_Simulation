/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator_simulation;


public class Clock {
private int currentTime;


Clock(){
    currentTime = 0;
}

public void reset(){
    currentTime = 0;
}

public void tick(){
    currentTime++;
}

public int getTime(){
    return currentTime;
}

}
