import java.util.*;

public class SideEffects {

   public static void main(String[] args) {
      int[] a = {1, 2, 3};
      System.out.println(Arrays.toString(a));
      changesArray(a);
      System.out.println(Arrays.toString(a));
   
      int[] a1 = {1, 2, 3};
      System.out.println(Arrays.toString(a1));
      doesNotChangeArray(a1);
      System.out.println(Arrays.toString(a1));
      
      int i = 0;
      noSideEffectForPrimitiveTypeParams(i);
      System.out.println(i);
      
      String s = "Hello";
      noSideEffectForStrings(s);
      System.out.println(s);

      String s1 = "Hello";
      stringsCantBeChanged(s1);
      System.out.println(s1);
   }

   public static void changesArray(int[] a){
      a[0] = 9;
      a[1] = 9;
      a[2] = 9;
   }
   
   public static void doesNotChangeArray(int[] a){
      a = new int[3];
      a[0] = 9;
      a[1] = 9;
      a[2] = 9;
   }
   
   public static void noSideEffectForPrimitiveTypeParams(int i){
      i = 9;
   }
   
   public static void noSideEffectForStrings(String s){
      s = "Hi";
   }

   public static void stringsCantBeChanged(String s){
      s.toUpperCase();
   }

}