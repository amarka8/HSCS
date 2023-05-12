import java.util.Scanner;
/**
 * The Class Represents a Bank Account 
 * @author Amar Kanakamedala
 */
public class BankAccount {
    public static final double Overdraft = 100;
    public static final String passkey = "1234";
    private double balance;
    /**
     * Bank Account Constructor 
     * @param balance balance in an account
     * precondition- balance>=0
     */
    public BankAccount(double balance){
        assert balance>=0;
        this.balance=balance;
    }
    //postcondition- constructs a bank account with a balance >=0

    /**
     * deposit money method
     * @param plus the amount to deposit in an account
     * precondition- plus >0
     */
    public void deposit (double plus){
        assert plus>0;
        balance+=plus;
    }
    //postcondition- adds money to one's account

     /**
     * withdraw money method
     * @param minus the amount to withdraw in an account
     * precondition- minus>0
     */
    public void withdraw(double minus){
        assert minus>0;
        balance-=minus;
    }
    //postcondition withdraws money from one's account

    /**
     * transfer method between two different accounts
     * @param object1 the account to transfer money into
     * @param money how much money to transfer
     * precondition- object1 must be a bank account / money>0
     */
    public void transfer(BankAccount object1, double money){
        assert object1 instanceof BankAccount && money>0;
        object1.deposit(money);
    }
    //postcondition- transfers money between two bank accounts

    /**
     * getter method
     * @return returns the balance in an account
     * precondition- balance >=0
     */
    public double getBalance(){
        assert balance>=0;
        return balance;
    }
    //postcondition- returns the balance of a bank account
}