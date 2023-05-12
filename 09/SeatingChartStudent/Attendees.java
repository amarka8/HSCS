import java.util.ArrayList;


public class Attendees {
	
	private ArrayList<Employee> attendees;
	
	public Attendees()
	{
		attendees = new ArrayList<Employee>();
	}
	
	public void addAttendee(Employee attendee)
	{
		attendees.add(attendee);
	}
	
	public ArrayList<Employee> getAttendees()
	{
		return attendees;
	}
	
	public int getTotalAttendees()
	{
		return attendees.size();
	}
	
	public String toString()
	{
		String r = "";
		for (Employee attendee : attendees)
		{
			r += attendee.toString() + "\n";
		}
		return r;
	}

}
