import java.util.*;

public class Exceptions {

    public static void main(String[] args) {
    	
		/*	Exception types on the AP exam are demonstrated below. Each
		 *	Exception is a class that has the RuntimeException class
		 *	in its inheritance hierarchy. RuntimeException inherits
		 *	from the Exception class. The code examples generate
		 *	run-time errors. When a run-time error occurs, we say the
		 *	program "throws" an Exception. The thrown Exception is an
		 *	instance of a class (an object).
		 *
		 *	Assignment: Uncomment the code and change it so that it no
		 *	longer throws an Exception.
		 */

		//**************************************************************

    	/*	ArithmeticException
    	 *
    	 *	Thrown when an exceptional arithmetic condition has occurred.
    	 */
    	//System.out.println(4/0);

		//**************************************************************

    	/*	ArrayIndexOutOfBoundsException
    	 *
    	 *	Thrown to indicate that an array has been accessed
    	 *	with an illegal index. The index is either negative
    	 *	or greater than or equal to the size of the array.
    	 */
		
		/*
		String[] a1 = {"zero", "one", "two"};
		System.out.println(a1[3]);
		*/
		
		//**************************************************************

    	/*	IndexOutOfBoundsException
    	 *
    	 *  Thrown to indicate that an index of some sort (such as 
    	 *  to an array, to a string, or to a vector) is out of range.
    	 */
		
    	/*
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("zero");
		a2.add("one");
		a2.add("two");
		System.out.println(a2.get(3));
		*/

    	// StringIndexOutOfBoundsException (subclass of 
    	// IndexOutOfBoundsException) on Strings
    	/*
    	String s = "test";
    	s = s.substring(5);
    	System.out.println(s);
    	*/
    	
		//**************************************************************

		/*	IllegalArgumentException
		 *
		 *	Thrown to indicate that a method has been passed an
		 *	illegal or inappropriate argument.
		 */
		/*
		Random r = new Random();
		System.out.println(r.nextInt(-1));
		*/

		//**************************************************************

		/*	NullPointerException
		 *
		 *	Thrown when an application attempts to use null
		 *	in a case where an object is required.
		 */
		/*
		String s2 = null;
		System.out.println(s2.length());
		*/

		//**************************************************************

    }
}
