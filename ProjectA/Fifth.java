import java.util.Arrays;
import java.util.Scanner;
public class Fifth {
    public static void main (String[] args){
        boolean done=false;
        boolean found=false;
        int currentSize=0;
        String[] names=new String[0];
        Scanner in= new Scanner(System.in);
        System.out.print("Enter Any # names and enter d for done: ");
        while(!done){
            String name=in.next();
            if(!name.equalsIgnoreCase("d")){//better way to do this?
                names=Arrays.copyOf(names, names.length+1);
                names[currentSize]=name;
                currentSize++;
            }
            done=name.equalsIgnoreCase("d"); 
        }
        Scanner in2=new Scanner(System.in);
        while(!found){
            int index= (int) (Math.random()*names.length);
            System.out.println("\n"+names[index]);
            System.out.print("Y for more names and anything else to stop:");
            String check= in2.next();
            found=!check.equals("Y"); 
        }
    }
}
