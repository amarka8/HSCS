public class InsertionSortPractice {
    private int choose;
    public void decider(int decider){
        this.choose=decider;
    }
    public void sort(int[] array){
        for(int j=1;j<array.length;j++){
            int pick=array[j];
            int i=j;
            while((i>0)&&(choose*(pick)<array[i-1])){
                array[i]=array[i-1];
                i--;
            }
            array[i]=pick;
        }
    } 
}
