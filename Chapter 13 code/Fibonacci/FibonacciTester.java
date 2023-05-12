/**
 * @(#)FibonacciTester.java
 *
 * FibonacciTester application
 *
 * @author
 * @version 1.00 2011/3/19
 */

import java.util.*;

public class FibonacciTester {

    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = in.nextInt();

		Fibonacci fib = new Fibonacci();

		for (int i = 1; i <= n; i++)
		{
			fib.resetCalls();
			//long f = fib.fib(i);
			long f = fib.fibRecursive(i);
			System.out.println("fib(" + i + ") = " + f);
			System.out.println("calls = " + fib.getCalls());
		}

		/*for (int i = 1; i <= n; i++)
		{
			fib.resetCalls();
			long f = fib.fib(i);
			System.out.println("fib(" + i + ") = " + f);
			System.out.println("calls = " + fib.getCalls());
		}*/

    }

}
