
public class ProductDatabaseTester {

    public static void main(String[] args) {

    	ProductDatabase pd = new ProductDatabase();

    	pd.addProduct("Fallout 4", "Bethesda", 5);
    	pd.addProduct("Hard Adonized Nonstick Skillet", "Analon", 4);
    	pd.addProduct("Lucky Bamboo", "9GreenBox", 3);
    	pd.addProduct("Flashdrive 128GB", "Samsung", 4);
    	pd.addProduct("Countertop Oven", "Hamilton Beach", 2);
    	pd.addProduct("Smoothy Smart Blender", "Hamilton Beach", 1);
    	pd.addProduct("In-Wall Cabinet", "Stack-On", 4);
    	pd.addProduct("Futurama Planet Express Adult T-Shirt", "Ripple Junction", 5);

    	System.out.println(pd.toString());

    	pd.removeByVendor("Hamilton Beach");

    	System.out.println(pd.toString());

    }
}
