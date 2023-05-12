import java.util.Arrays;

public class Arays {
    public static int[] random (int range,int length){
        int[] numbers= new int[length];
        for (int i=0;i<length;i++){
            numbers[i]=(int)( Math.random()*range);
        }
        return numbers;
    }
    public static int sum(int[] input){
        int total=0;
        for (int member:input){
            total+=member;
        }
        return total;
    }
    public static int average(int[] input){
        int total=0;
        int average=0;
        for (int member:input){
            total+=member;
            average=total/input.length;
        }
        return average;
    }
    public static int odd(int[] input){
        int total=0;
        for (int member:input){
           if(member%2==1)
            total+=1;
        }
        return total;
    }
    public static int max(int[] input){
        int maximum=0;
        for (int member:input){
           maximum=Math.max(maximum, member);
        }
        return maximum;
    }
    public static int min(int[] input){
        int minimum=0;
        for (int member:input){
           minimum=Math.max(minimum, member);
        }
        return minimum;
    }
    public static int find(int[] input, int criteria){
        boolean found=false;
        int i=0;
        while (i<input.length && !found){
           if(input[i]==criteria){
               found=true;
           }
           else{
            i++;
           }
        }
        return i;
    }
    public static int[] append(int[] input, int insert, int position){
        int[] modified= new int[input.length+1];
        modified[position]=insert;
        for (int i=0;i<input.length;i++){
            if(i<position){
                modified[i]=input[i];
            }
            else{
                modified[i+1]=input[i];
            }
        }
        return modified;
    }
    public static int[] remove(int[] input,int position){
        int[] modified= new int[input.length-1];
        for (int i=0;i<input.length;i++){
            if(i<position){
                modified[i]=input[i];
            }
            else{
                modified[i]=input[i+1];
            }
        }
        return modified;
    }
    public static String separator(int[] input, String character){
        String wanted="";
        for (int i=0;i<input.length;i++){
            if (i>0){
                wanted+=" "+ character+ " " +Integer.toString(input[i]);
            }
            else{
                wanted+=Integer.toString(input[i]);
            }
        }
        return wanted;
    }
    public static void main(String[] args){
        int[] values = {1,7,1};
        System.out.println(find(values,7));
    }
}
