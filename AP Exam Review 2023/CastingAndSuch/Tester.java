
public class Tester {

	public static void main(String[] args) {
		
		// you can assign more specific to less specific without casting
		// you can assign less specific to more specific by casting
		// you can call a method if it is available for the variable type
		// the implementation of a method called depends on object type

		// You can "convert" from subclass to superclass without casting
		Account account0 = new BankAccount();
		Account account1 = new SavingsAccount(0.05);
		CheckingAccount checkingAccount0 = new CheckingAccount(100);
		Account account2 = checkingAccount0;
		//CheckingAccount checkingAccount1 = new SavingsAccount(0.05);
		
		// You can "convert" from type that implements an interface to the interface type without casting
		Comparable comparable0 = new BankAccount();
		Comparable comparable1 = new SavingsAccount(0.05);
		//Comparable comparable2 = account0;

		// You can "convert" from superclass to subclass by casting
		BankAccount bankAccount0 = (BankAccount) account2;
		BankAccount bankAccount1 = (CheckingAccount) account2;
		CheckingAccount checkingAccount2 = (CheckingAccount)account2;

		// You can "convert" from interface type to type that implements an interface by casting
		BankAccount bankAccount2 = (BankAccount)comparable1;
		BankAccount bankAccount3 = (SavingsAccount)comparable1;
		SavingsAccount savingsAccount0 = (SavingsAccount)comparable1;
		
		// The variable type determines whether you can call a method or not
		account0.deposit(100);
		//account0.withdraw(50);
		
		// The object type determines which implementaton of the method gets called
		account0.deposit(100);
		account2.deposit(100);

		System.out.println("test");
		
		// De Morgan's Law
		// Logical Expression Equivalence
		// Java Quick Reference
		
		// You cannot have objects of abstract classes
		// Account account3 = new Account(); // No!
		
		// In a class that extends an abstract class, you must implement all abstract methods or make
		// them abstract.
		
		// Any call to a superclass constructor must be the first line of code in the subclass conctructor.
		
		// If there is a superclass constructor without params, do not have to (but may) call that
		// constructor from the subclass constructor.
		// Notice how in the SavingsAccount constructor, there is no call to super().
		
		// If there is no superclass constructor without params, you must call a superclass constructor.
		// Notice the superclass constructor call in CheckingAccount. It is not there because is has to be,
		// but because the balance needs to be initialized.
		
	}

}
