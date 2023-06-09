// Pointing to same instance memory

import java.io.*;
class Demo {
	int x = 10;
	int display()
	{
		System.out.println("x = " + x);
		return 0;
	}
}
class Main {
	public static void main(String[] args)
	{
		// create instance
		Demo D1 = new Demo();

		// point to same reference
		Demo G1 = D1;

		Demo M1 = new Demo();

		Demo Q1 = M1;

		// updating the value of x using G!
		// reference variable
		D1.x = 25;

		System.out.println(G1.x); // Point 1

		System.out.println(D1.x); // Point 2
	}
}
