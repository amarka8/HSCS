public class Tail{
    private int base;
    private int exponent;
    public Tail(int base, int exponent){
        this.base=base;
        this.exponent=exponent;
    }
    //how can I fix this to where if I put in 0, it does not multiply by 0?
    public int getProductTail(int exponent,int product){
        if(exponent==0)return product;
        return getProductTail(exponent-1,base*product);
    }
    public int getFactorialTail(int base, int result){ 
        if(base==1)return result;
        return getFactorialTail(base-1, result*base);
    }
}