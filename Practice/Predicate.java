//other methods- compare 2 letters (exp "a".comparesTo("b"))= -1 and opposite is 1 also compareToIgnoreCase (ignores capitalization)/ null- no object reference
public class Predicate {
    double balance;
    public Predicate(double balance){
        this.balance=balance;
    }
    public boolean isOverDrawn(){
        return balance < 0;
    }
    public static void main (String[] args){
        Predicate tester= new Predicate(-5);
        if (tester.isOverDrawn()){
            System.out.println("Test Successful");
        }
        String s1="Hello";
        String s2="Hello";
        if (s1.equals(s2)){
            System.out.println("Test Successful");
        }
    }
}


