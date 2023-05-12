public class Exponent {
    private int base;
    private int exponent;
    public Exponent (int base, int exponent){
        this.base=base;
        this.exponent=exponent;
    }
    public int getProductLong(){
        if(exponent==0)return 1;
        Exponent e=new Exponent(base, exponent-1);
        int product=base*e.getProductLong();
        return product;
    }
    public int getProductShort(int exponent){
        if(exponent==0)return 1;
        return base*getProductShort(exponent-1);
    }
    public int getProductIterative(){
        int product=base;
        for(int i=exponent;i>1;i--){
            product=product*base;
        }
        return product;
    }
}
    /**
     * 4,3
     * 4,2
     * product=4*get product of 4,2
     * 4,1
     * 4* get product of 4,1
     * 4*get product of 4,0
     * 4*1=4
     */

