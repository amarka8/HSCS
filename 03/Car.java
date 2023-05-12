// Write a class called Car. An Car has an amount of fuel and a fuel efficiency in miles per gallon. Supply a
// constructor and the methods getFuelAmount, getFuelEfficiency, addFuel, and drive.
// addFuel takes a parameter and increases the fuel by that amount. drive takes a number as a parameter and
// uses that number as a distance driven to reduce the fuel by the amount consumed over that distance. Supply
// private implementation for all methods. - Problem 1 
public class Car {
    private double fuel;
    private double fuelEff;
    public Car(double fuel, double fuelEff){
        this.fuel=fuel;
        this.fuelEff=fuelEff;

    }
    public double getFuelAmount(){
        return fuel;
    }
    public double getFuelEfficiency(){
        return fuelEff;
    }
    public void addFuel(double fill){
        fuel+=fill;
    }
    public void drive(double miles){
        double newMiles=(fuel*fuelEff)-miles;
        fuel=newMiles/fuelEff;
    }
    public static void main(String[] args){
        Car honda=new Car(30,5);
        honda.drive(5);
        System.out.println(honda.getFuelAmount());
    }
}
//java doc
/*
What the method does
@param
@return
 */