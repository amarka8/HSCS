import java.util.ArrayList;

public class RandomEmployee {

	public static Employee getRandomEmployee()
	{
		int type = (int)(Math.random() * 3);
		Employee employee;
		switch (type)
		{
			case 0 :
				employee = new Employee(getRandomName(), getRandomSalary(20000));
				break;
			case 1 :
				employee = new Manager(getRandomName(), getRandomSalary(50000), getRandomDepartment());
				break;
			default :
				employee = new Executive(getRandomName(), getRandomSalary(100000), getRandomDepartment());
				break;
		}
		return employee;
	}
	
	private static String getRandomName()
	{
		String name = "";
		ArrayList<String> firstNames = new ArrayList<String>();
		ArrayList<String> lastNames = new ArrayList<String>();
		firstNames.add("Uliana");
		firstNames.add("Hazel");
		firstNames.add("Azubuike");
		firstNames.add("Rosabella");
		firstNames.add("Merari");
		lastNames.add("Martel");
		lastNames.add("Marek");
		lastNames.add("Paternoster");
		lastNames.add("Eliassen");
		lastNames.add("Tinker");
		int first = (int)(Math.random() * firstNames.size());
		int last = (int)(Math.random() * lastNames.size());
		name = lastNames.get(last) + ", " + firstNames.get(first);
		return name;
	}
	
	private static int getRandomSalary(int minimumSalary)
	{
		return (int)(Math.random() * 90) * 1000 + minimumSalary;
	}
	
	private static String getRandomDepartment()
	{
		ArrayList<String> departments = new ArrayList<String>();
		departments.add("Human Resources");
		departments.add("Marketing");
		departments.add("Finance");
		departments.add("Information Technology");
		departments.add("Sales");
		int department = (int)(Math.random() * departments.size());
		return departments.get(department);
	}
}
