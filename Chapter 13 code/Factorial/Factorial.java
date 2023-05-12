
public class Factorial {

	int number;

	public Factorial(int number)
	{
		this.number = number;
	}

	public int getFactorial()
	{
		int r = 0;
		if (number == 0)
		{
			r = 1;
		}
		else
		{
			Factorial factorial = new Factorial(number - 1);
			r = number * factorial.getFactorial();
		}
		return r;
	}

}
