public class Item {
    private String name;
    private String vendor;
    private int cost;
    private int rating;
    public Item(String name, String vendor, int cost, int rating){
        this.name=name;
        this.vendor=vendor;
        this.cost=cost;
        this.rating=rating;
    }
    public int getCost(){
        return cost;
    }
    public int getRating(){
        return rating;
    }
    public String getName(){
        return name;
    }
    public String getVendor(){
        return vendor;
    }
}
