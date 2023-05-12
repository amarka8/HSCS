/**
 * @(#)P145.java
 *
 * P145 application
 *
 * @author
 * @version 1.00 2012/4/19
 */

import java.util.Scanner;

public class P145 {

    public static void main(String[] args) {

		PhoneBook phoneBook = new PhoneBook();
		System.out.println(phoneBook.toString());

		BinarySearcher bs = new BinarySearcher(phoneBook.entries);

		Scanner in = new Scanner(System.in);
		String instructions = "Enter a name (last first) to retrieve a phone number. Q to quit:";
		System.out.println(instructions);
		String input = in.nextLine();
		while (!input.equalsIgnoreCase("q"))
		{
			int index = bs.searchRecursive(new PhoneBookEntry(input));
			if (index > -1)
			{
				System.out.println("Ths phone number is " + phoneBook.entries[index].getNumber() + ".");
			}
			else
			{
				System.out.println(input + " is not listed.");
			}
			System.out.println(instructions);
			input = in.nextLine();
		}

    }
}
