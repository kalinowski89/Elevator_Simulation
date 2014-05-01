
package elevator_simulation;

public class Person {
private int personID;
private int startFloor;
private int endFloor;
private int timeStart;

Person(int personID, int start, int end){
    this.personID = personID;
    this.startFloor = start;
    this.endFloor = end;
    //timestart will take current time from clock clas
}

public int getPersonID(){
    return personID;
}

public void setPersonID(int personID){
    this.personID = personID;
}

public int getStartFloor(){
    return startFloor;
}

public void setStartFloor(int startFloor){
    this.startFloor = startFloor;
}

public int getEndFloor(){
    return endFloor;
}

public void setEndFloor(int endFloor){
    this.endFloor = endFloor;
}

public int getTimeStart(){
    return timeStart;
}

public void setTimeStart(int timeStart){
    this.timeStart = timeStart;
}

}
