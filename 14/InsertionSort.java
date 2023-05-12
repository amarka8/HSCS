public class InsertionSort {
    public void sortHelper(Comparable[] numbers, int decider){
        //-1 for descending and 1 for ascending bc >0 means first comes after second and for ascending you shift if it comes after 
        sort(numbers,decider);
    }
    public void sort(Comparable[] numbers, int decider){
        for (int j=1;j<numbers.length;j++){
            Comparable next= numbers[j];
            int i=j;
            while (decider*(numbers[i-1].compareTo(numbers[i]))>0&&i>0){
                numbers[i]=numbers[i-1];
                i--;
            }
            numbers[i]=next;
        }
    }
}
