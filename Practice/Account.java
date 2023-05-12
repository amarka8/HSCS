public abstract class Account {
    private int accNum;
    public Account(int num){
        this.accNum=num;
    }
    public abstract void deposit(int addition);
    // public String toString(){
    //     String s="";
    //     s+=accNum;
    //     return s;
    // }
}
