import java.util.ArrayList;
import java.util.Scanner;
public class Cart {
    private ArrayList<Item> stuff;
    public Cart(){
        stuff= new ArrayList<Item>();
    }
    public void addItem(String name, String vendor, int cost, int rating){
        Item element= new Item(name, vendor, cost, rating);
        stuff.add(element);
    }
    public void removeItem(String name){
        for(int i=(stuff.size()-1);i>=0;i++){
            if(stuff.get(i).getName().equalsIgnoreCase(name)){
                stuff.remove(i);
            }
        }
    }
    public int getTotalCost(){
        int val=0;
        for(Item element:stuff){
            val+=element.getCost();
        }
        return val;
    }
    public int mostExpensive(){
        int val=stuff.get(0).getCost();
        for(Item element:stuff){
            val=Math.max(val,element.getCost());
        }
        return val;
    }
    public int chooseItem(){
        int number=0;
        Scanner in=new Scanner(System.in);
        System.out.print("what type of property: ");
        String type=in.next();
        System.out.print("what property: ");
        String thing=in.next();
        if(type.equalsIgnoreCase("name")){
            for(Item element:stuff){
                if (element.getName().equals(thing)){
                    number++;
                }
            }
        }
        if(type.equalsIgnoreCase("vendor")){
            for(Item element:stuff){
                if (element.getVendor().equals(thing)){
                    number++;
                }
            }
        }
        if(type.equalsIgnoreCase("cost")){
            Integer check=Integer.parseInt(thing);
            for(Item element:stuff){
                if (element.getCost()==check){
                    number++;
                }
            }
        }
        if(type.equalsIgnoreCase("rating")){
            Integer check=Integer.parseInt(thing);
            for(Item element:stuff){
                if (element.getRating()==check){
                    number++;
                }
            }
        }
        return number;
    }
    public String toString(){
        String s="\n"+"There are "+ stuff.size()+" items in the cart";
        s+="\n";
        for(Item element:stuff){
            s+=element.getName()+" by "+element.getVendor() + " costs "+element.getCost()+" and is rated a "+element.getRating();
            s+="\n";
        }
        return s;
    }
}