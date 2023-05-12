// Write a class of your choosing that models a real-world object. Include instance variables, constructor, encapsulating
// methods, at least one mutator method, and private implementation for all methods. -Problem 2 
public class Business {
    private double profit;
    private String name;
    public Business (double profit, String name){
    this.profit=profit;
    this.name=name;
    }
    public String getName(){
        return name;
    }
    public double getProfit(){
        return profit;
    }
    public void profitCalc(double expenses, double revenue){
        profit=revenue-expenses;
    }
}
