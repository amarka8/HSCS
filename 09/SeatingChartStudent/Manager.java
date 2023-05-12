
public class Manager extends Employee{

	private String department;

	public Manager(String name, double salary, String department)
	{
		super(name, salary);
		this.department = department;
	}

	public String getDepartment()
	{
		return department;
	}

	public String toString()
	{
		return
			super.toString() +
			"Department: " + department + "\n";
	}

	public boolean equals(Object obj)
	{
		Manager manager = (Manager)obj;
		return
				super.equals(manager) &&
				getDepartment().equals(manager.getDepartment())
				;
	}

}
