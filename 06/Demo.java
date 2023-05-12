import java.util.Scanner;
//look at comparing adjacent values 275 and 282 and 285
public class Demo {
    public static void main (String[] args){
        double total=0;
        double count=0;
        boolean test=false;
        Scanner in= new Scanner(System.in);
        while (!test){ 
            System.out.print("Enter #'s:, -1 to break: ");
            Double input=in.nextDouble();
            if(input==-1){
                test=true;
            }
            else{
            total+=input;
            count+=1;
            }
        }
        System.out.println(total/count);
    }
}
