
public class Power {

	int base;
	int exponent;

	public Power (int base, int exponent)
	{
		this.base = base;
		this.exponent = exponent;
	}

	public int getPower()
	{
		int r = 0;
		if (exponent == 0)
		{
			r = 1;
		}
		else
		{
			Power p = new Power(base, exponent - 1);
			r = base * p.getPower();
		}
		return r;
	}

}
