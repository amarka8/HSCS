import java.util.Scanner;
import java.util.Stack;
import java.lang.Integer;
import java.lang.Character;
import java.math.*;
// Use a stack to reverse the words of a sentence. Keep reading words until you have a word that ends in a period, adding them onto a stack. When you have a word with a period, pop the words off and print them. Stop when there are no more words in the input. For example, you should turn the input
// Mary had a little lamb. Its fleece was white as snow.
// into
// Lamb little a had mary. Snow as white was fleece its.
// Pay attention to capitalization and the placement of the period.
public class Stacks {
    public static void main (String[] args){
    //     Stack<String> container= new Stack<String>();
    //     Scanner in = new Scanner(System.in);
    //     boolean done=false;
    //     while(!done){
    //         System.out.print("Enter word: ");
    //         String word=in.next();
    //         container.push(word);
    //         if(word.endsWith(".")){
    //             done=true;
    //         }
    //     }
    //     int senLen=container.size();
    //     while(container.size()>0){
    //         if(container.size()==senLen){
    //             String firstWord=container.pop();
    //             String newWord=firstWord.substring(0,1).toUpperCase()+firstWord.substring(1,firstWord.length()-1);
    //             System.out.println(newWord+" ");
    //         }
    //         else if(container.size()==1){
    //             System.out.println(container.pop().toLowerCase()+".");
    //         }
    //         else{
    //             System.out.println(container.pop()+" ");
    //         }
    //     }        
    // Stack<String> numbers= new Stack<String>();
    // Scanner in2 = new Scanner(System.in);
    // System.out.print("Enter number");
    // int n= in2.nextInt();
    // String number=getNumber(n);
    // for(int i=0;i<number.length();i++){
    //     numbers.push(number.substring(i, i+1));
    // }
    // while(numbers.size()>1){
    //     System.out.print(numbers.pop()+", ");
    // }
    // System.out.print(numbers.pop());
    // }
    // public static String getNumber(int number){
    //     if(number<10){
    //         return ""+number;
    //     }
    //     String digit=""+(number%10);
    //     return digit+getNumber(number/10);
    // }
    //polish calculator
        Stack<Integer> polish= new Stack<Integer>();
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Expression, q to quit: ");
        boolean done=false;
        int num=0;
        while(!done && in.hasNext()){
            char c= in.next().charAt(0);
            if(c=='q'){
                done=true;
            }
            else if(Character.isDigit(c)){
                polish.add(Character.digit(c, 10));
            }
            else{
                if(c=='+'){
                    polish.push(polish.pop()+polish.pop());
                }
                if(c=='x'){
                    polish.push(polish.pop() * polish.pop());
                }
            }
        }
        System.out.println(polish);
    }
}
