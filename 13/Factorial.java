// Compute the factorial of an integer.
// recursively by providing a class so that new objects of the class are made during the recursion
// recursively with just a method that calls itself
// iteratively
public class Factorial {
    private int startNum;
    public Factorial(int startNum){
        this.startNum=startNum;
    }
    public int getFactorialLong(){
        if(startNum==0)return 1;
        Factorial lessNum= new Factorial(startNum-1);
        int product=lessNum.getFactorialLong();
        return product*startNum;
    }
    public int getFactorialShort(int startNum){
        if(startNum==0)return 1;
        return startNum*getFactorialShort(startNum-1);
    }
    public int getFactorialIterative(){
        int product=startNum;
        for(int i=3;i>0;i--){
            product=product*i;
        }
        return product;
    }
}
