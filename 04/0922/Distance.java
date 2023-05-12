import java.util.Scanner;
// Write a program that prompts the user for a measurement in meters and the converts it into miles, feet, and inches.
// If, for example, the user enters 2000, the program should print:
// Miles: 1
// Feet: 1281
// Inches: 8.353188263511584
//problem: 3 separate conversions but the instructions call for one - convert all three conversions into one large conversion?
public class Distance {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.print("Measurement in Meters: "); //print not println
        double meters= in.nextDouble();
        double miles=Math.floor(meters/1609);
        double feet= Math.floor((meters % 1609)/(1/3.281));
        double inches=((meters % 1609)%(1/3.281))*39.37;
        // double inches= (((meters%1609)*3.281)-(Math.floor((meters % 1609)*3.281)))*39.37;
        // double inches= 
        // double inches=meter*39.37;
        System.out.println("Miles "+miles+ '\n'+ "feet " + feet+'\n'+ "inches "+inches);
        // System.out.println(inches);
    }
}
