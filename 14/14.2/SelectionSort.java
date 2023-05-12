// Modify the selection sort algorithm to sort an array of coins by their value.
import java.util.Arrays;
public class SelectionSort {
    private Coin[] numbers;
    public SelectionSort(Coin[] numbers){
        this.numbers=numbers;
    }
    public int findMin(int start){
        int position=start;
        for (int i=start;i<numbers.length;i++){
            if(numbers[i].compareTo(numbers[position])<1)
                position=i;
        }
        return position;
    }
    public void swap(int start){
        int position=findMin(start);
        Coin startVal=numbers[start];
        numbers[start]=numbers[position];
        numbers[position]=startVal;
    }
    public void sort(){
        for(int i=0;i<numbers.length-1;i++){
            swap(i);
        }
    }
    public String toString(){
        String s="";
        for(Coin c:numbers){
            s+=c;
            s+=" , ";
        }
        return s;
    }
}
