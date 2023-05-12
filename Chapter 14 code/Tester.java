public class Tester {

   public static void main (String[] args) {
      int[] a = {-4, 45, 0, 10, -7, 56, 22};
      SelectionSorter ss = new SelectionSorter(a);
      //InsertionSorter ss = new InsertionSorter(a);
      ss.sort();
   }

}