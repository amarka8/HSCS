/**
   A bank account has a balance that can be changed by
   deposits and withdrawals.
*/
public class BankAccount extends Account implements Comparable<BankAccount>
{
	private double balance;

	/**
	  Constructs a bank account with a zero balance.
	*/
	public BankAccount()
	{
	}

	/**
	  Constructs a bank account with a given balance.
	  @param initialBalance the initial balance
	*/
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
	}

	/**
	  Deposits money into the bank account.
	  @param amount the amount to deposit
	*/
	public void deposit(double amount)
	{
		System.out.println("BankAccount deposit");
		balance = balance + amount;
	}

	/**
	  Withdraws money from the bank account.
	  @param amount the amount to withdraw
	*/
	public void withdraw(double amount)
	{
		System.out.println("BankAccount withdraw.");
		balance = balance - amount;
	}
	
	public void transfer(double amount, BankAccount destinationAccount)
	{
		withdraw(amount);
		destinationAccount.deposit(amount);
	}

	/**
	  Gets the current balance of the bank account.
	  @return the current balance
	*/
	public double getBalance()
	{
		return balance;
	}
	
	public boolean equals(Object obj)
	{
		if (obj instanceof BankAccount){
			BankAccount account = (BankAccount)obj;
			return getBalance() == account.getBalance();
		}
	}
	
	public String toString()
	{
		return "" + getBalance();
	}
	
	public int compareTo(BankAccount account)
	{
		int r = 0;
		if (balance - account.getBalance() > 0) r = 1;
		else if (balance - account.getBalance() < 0) r = -1;
		return r;
	}
}
