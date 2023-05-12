import java.lang.reflect.Array;
import java.util.Arrays;

public class Know{
    public static void main (String[] args){
        final double constant=2;
        int letter= 7;
        String num= Integer.toString(letter);
        int letter2=Integer.parseInt(num);
        int[] input= {1,1,1};
        int[] modified= new int[input.length+1];
        modified[1]=7;
        for (int i=0;i<input.length;i++){
            if(i<1){
                modified[i]=input[i];
            }
            else{
                modified[i+1]=input[i];
                System.out.println(modified[i+1]);
            }
        }

    }
}
 