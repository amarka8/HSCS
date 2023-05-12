
import java.util.Scanner;

public class FactorialTester {

    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter an int to compute its factorial. Enter anything else to quit.");

		boolean done = false;

		while (!done)
		{
			if (in.hasNextInt())
			{
				int n = in.nextInt();
				Factorial factorial = new Factorial(n);
				System.out.println(factorial.getFactorial());
				System.out.println(getFactorial(n));
				System.out.println(getFactorial(n, 1));
				
				int result = 1;
				for (int i = 1; i <= n; i++)
				{
					result = result * i;
				}
				System.out.println(result);
			}
			else
			{
				done = true;
			}
		}
    }
    
    public static int getFactorial(int n)
    {
    	if (n == 0) return 1;
    	return n * getFactorial(n - 1);
    }

    public static int getFactorial(int n, int result)
    {
    	if (n == 0) return result;
    	return getFactorial(n - 1, n * result);
    }

}
