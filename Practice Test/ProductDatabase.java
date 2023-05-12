import java.util.ArrayList;
public class ProductDatabase{
    private ArrayList<Product> products;
    public ProductDatabase(){
        products=new ArrayList<Product>();
    }
    public void addProduct(String name, String vendor, int rating){
        products.add(new Product(name,vendor,rating));
    }
    public void removeByVendor(String vendor){
        for (int i=(products.size()-1);i>=0;i--){
            if(products.get(i).getVendor().equals(vendor)){
                products.remove(i);
            }
        }
    }
    public String toString(){
        String s="There are "+ products.size()+ " products in the database";
        s+="\n";
        s+="\n";
        for (Product product: products){
            s+=product.toString();
            for (int i=0;i<product.getRating();i++){
                s+="*";
            }
            s+="\n";
        }
        return s;
    }
}