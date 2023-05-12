import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		//doTest(10);
		//doTest(25);
		doTest(50);
	}
	
	private static void doTest(int totalAttendees)
	{
		Attendees attendees = new Attendees();
		for (int i = 0; i < totalAttendees; i++)
		{
			attendees.addAttendee(RandomEmployee.getRandomEmployee());
		}
		SeatingChart seatingChart = new SeatingChart(attendees);
		// System.out.println(attendees);
		System.out.println(seatingChart);
		// System.out.println(seatingChart.getRows());
	}

}
