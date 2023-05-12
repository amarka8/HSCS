public class Product{
    private String name;
    private String vendor;
    private int rating;
    public Product(String name,String vendor, int rating){
        this.name=name;
        this.vendor=vendor;
        this.rating=rating;
    }
    public String getName(){
        return name;
    }
    public String getVendor(){
        return vendor;
    }
    public int getRating(){
        return rating;
    }
    public String toString(){
        String s="";
        s+=name+ " by "+vendor+ " ";
        return s;
    }
}