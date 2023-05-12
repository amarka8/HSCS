public class Executive extends Manager{

	public Executive(String name, double salary, String department)
	{
		super(name, salary, department);
	}

	public boolean equals(Object obj)
	{
		Executive executive = (Executive)obj;
		return
				super.equals(executive)
				;
	}

}
