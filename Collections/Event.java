/**
 * An Event object has an instance variable to indicate at which time it should be processed. When that time has arrived, the event’s process method is called. This method may move objects around, update information, and schedule additional events.
The Event class also implements the Comparable interface. An event is considered more urgent than another if its processing time is earlier.
 */
public class Event implements Comparable<Event>{
    private double time;
    private int action;
    public Event(double eventTime, int action){
        this.time=eventTime;
        this.action=action;
    }
    public double getTime(){
        return time;
    }
    public void process(){}
    public int compareTo(Event e){
        if(time<e.getTime()){
            return -1;
        }
        else if (time==e.getTime()){
            return 0;
        }
        else{
            return 1;
        }
    }
}
