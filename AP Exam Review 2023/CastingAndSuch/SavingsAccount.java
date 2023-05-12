
public class SavingsAccount extends BankAccount {
	
	private double interestRate;
	
	public SavingsAccount(double rate)
	{
		interestRate = rate;
	}
	
	public void deductFees()
	{
		
	}
	
	public double getInterestRate()
	{
		return interestRate;
	}
	
	public void addInterest()
	{
		double interest = getBalance() * interestRate/100;
		deposit(interest);
	}
	
	public boolean equals(Object obj)
	{
		SavingsAccount account = (SavingsAccount)obj;
		return
				super.equals(account) &&
				getInterestRate() == account.getInterestRate();
	}
	
}
