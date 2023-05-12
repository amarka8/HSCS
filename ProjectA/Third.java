import java.util.Scanner;

public class Third {
    public static void main (String[] args){
        String[] names= {"Aryaan","Lou","Gabriel","Alan","Bryan","Will","Amar","Varun","Sai","Adrish","Jorge","Jerry"};
        boolean found= false;
        Scanner in= new Scanner(System.in);
        while(!found){
            int index= (int) (Math.random()*12);
            System.out.println(names[index]);
            System.out.print("Y for more names and anything else to stop:");
            String check= in.next();
            found=!check.equals("Y"); 
        }
    }
}
