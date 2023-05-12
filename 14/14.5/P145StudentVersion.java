/**
 * @(#)P145StudentVersion.java
 *
 * P145StudentVersion application
 *
 * @author
 * @version 1.00 2013/3/25
 */
import java.util.Scanner;
public class P145StudentVersion {

    public static void main(String[] args) {

		// RandomUtil and PhoneBook are complete. They can be 
    	// used to create a phone book of randomly generated 
    	// names and phone numbers.

		// Part A
		// Alter MergeSorter so that it will sort an array of 
    	// Comparable types in alphabetical name order.

		// Part B
		// Alter the BinarySearcher so that it can be used to 
    	// locate the index of a value in an array of Comparable 
    	// types. Alter the search  method of BinarySearcher so 
    	// that it is recursive. 

		// Part C
    	// Alter the PhoneBookEntry class so that it works with
    	// MergeSorter and BinarySearcher. Here in the main 
    	// method, create a phone book, and  allow the user to 
    	// search for a name and retrieve phone number if that 
    	// name is present. Report to the user if the name is 
    	// not present. Do this in a loop so that the user can 
    	// repeatedly look up phone numbers.
		PhoneBook phonebook=new PhoneBook();
      	System.out.println(phonebook.toString());
		BinarySearcher searchIn= new BinarySearcher(phonebook.getPhoneBook());
		Scanner in = new Scanner(System.in);
		in.useDelimiter("[^a-z\sA-Z]+");
		System.out.print("Enter Name, -1 to stop: ");
		while (in.hasNext()){
			String input=in.nextLine();
			System.out.println(input);
			// PhoneBookEntry searchFor= new PhoneBookEntry(input);
			// System.out.println(searchFor.getName());
			// int index=searchIn.search(searchFor,0,phonebook.getPhoneBook().length-1);
			// if(index>-1){
			// 	System.out.println(phonebook.getPhoneBook()[index].getName()+" "+ phonebook.getPhoneBook()[index].getNumber());
			// }
			// else{
			// 	System.out.println("Not Found");
			// }
		}
    }
}
