
public class CheckingAccount extends BankAccount {
	
	private static final int FREE_TRANSACTIONS = 3;
	private static final double TRANSACTION_FEE = 2.0;
	
	private int transactionCount;
	
	public CheckingAccount(double initialBalance)
	{
		super(initialBalance);
	}
	
	public void deposit(double amount)
	{
		System.out.println("CheckingAccount deposit");
		transactionCount++;
		super.deposit(amount);
	}
	
	public int deposit(double amount, int someOtherParam)
	{
		return 0;
	}
	
	public void withdraw(double amount)
	{
		System.out.println("CheckingAccount withdraw.");
		transactionCount++;
		super.withdraw(amount);
	}
	
	public void deductFees()
	{
		if (transactionCount > FREE_TRANSACTIONS)
		{
			double fees = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS);
			super.withdraw(fees);
		}
		transactionCount = 0;
	}
	
	public String toString()
	{
		String r = "" + getBalance();
		return r;
	}
	
	

}
