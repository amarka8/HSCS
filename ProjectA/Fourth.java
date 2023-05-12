import java.util.Scanner;

public class Fourth {
    public static void main (String[] args){
        boolean found=false;
        String[] names= new String[6];
        Scanner in= new Scanner(System.in);
        System.out.print("Enter 6 names: ");
        for(int i=0;i<names.length;i++){
            names[i]=in.next();
        }
        Scanner in2= new Scanner(System.in);
        while(!found){
            int index= (int) (Math.random()*6);
            System.out.println("\n"+names[index]);
            System.out.print("Y for more names and anything else to stop:");
            String check= in2.next();
            found=!check.equals("Y"); 
        }
    }
}
