//Objectuve: simulate and print one roll of a six sided die
import java.util.Random;
public class DieSimulator {
    public static void main(String[] args){
    Random die = new Random();
    System.out.println(die.nextInt(7)+1);
    }
}
