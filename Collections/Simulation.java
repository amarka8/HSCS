import java.util.PriorityQueue;
import java.util.Queue;
public class Simulation {
    private Queue<Event> events;
    private double simTime;
    public Simulation(){
        events= new PriorityQueue<Event>();
    }
    public void retrieve(){
        while(simTime<=events.get(events.size()-1)).getTime()){
            for(Event event: events){
                event.process();
                simTime+=expdist(1);
            }
        }
    }
    public static double expdist(double mean) {
        return -mean * Math.log(1 - Math.random()); 
    }
    // When a customer has completed a teller transaction, the time spent in the bank is logged, the customer is removed, and the next customer in the queue moves up to the teller.
}
