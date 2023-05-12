public class BankAccount3 extends Account {
    private int balance;
    public BankAccount3(int num,int balance){
        super(num);
        this.balance=balance;
    }
    public void deposit(int addition) {
        balance+=addition;
    }
    public void subtract(int addition) {
        balance-=addition;
    }
    public int getBalance(){
        return balance;
    }
    public String toString(){
        String s="";
        // s+=super.toString()+"\n";
        s+= getBalance();
        return s;
    }
}
