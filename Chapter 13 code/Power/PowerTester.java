
public class PowerTester {

    public static void main(String[] args) {

		Power p = new Power(2, 8);
		System.out.println(p.getPower());
		System.out.println(getPower(2, 8));
		System.out.println(getPower(2, 8, 1));
		
		int base = 2;
		int exponent = 8;
		int result = 1;
		for (int i = 0; i < 8; i++)
		{
			result = result * base;
		}
		System.out.println(result);

    }
    
    public static int getPower(int base, int exponent)
    {
    	if (exponent == 0) return 1;
    	return base * getPower(base, exponent - 1);
    }

    public static int getPower(int base, int exponent, int result)
    {
    	if (exponent == -1) return result;
    	return getPower(base, exponent - 1, base * result);
    }
}
