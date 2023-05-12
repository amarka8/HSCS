import java.util.Scanner;
public class Prime {
    public static void main (String[] args){
        double num=0;
        Scanner in= new Scanner(System.in);
        double limit=in.nextInt();
        for(double i=2;i<limit;i++){
            if(i!=2){
                // System.out.println(i);
                for(double z=2;z<=Math.ceil(i/2);z++){
                    if(i/z==(int)(i/z)){
                        num+=1;
                    }
                    // {
                    //     num+=1;
                    // }
                    // System.out.print(z);
                }   
                if(num<1){
                    System.out.println(i);
                }
            }
            else if (i==2){
                System.out.println(i);
            }
            num=0;
        }
    }
}
