import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class TestPractice{
    public static void main(String[] args){
        int[] numbers= {1,2,3,4,5,6};
        //create a new array without even numbers
        int[] newNums= Arrays.copyOf(numbers, 3);
        System.out.println(newNums[0]+" "+newNums[1]+" "+newNums[2]);
        Account example= new BankAccount3(1, 1000);
        example.deposit(10);
        example.subtract(10);
    }
}