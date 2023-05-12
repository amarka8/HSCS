
public class Employee {

	private String name;
	private double salary;

	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public String toString()
	{
		return
			"Name: " + name + "\n" +
			"Salary: " + salary + "\n";
	}
	
	public boolean equals(Object obj)
	{
		Employee employee = (Employee)obj;
		return
				getName().equals(employee.getName()) &&
				getSalary() == employee.getSalary()
				;
	}

}
