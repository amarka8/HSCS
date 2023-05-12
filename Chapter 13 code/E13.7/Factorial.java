public class Factorial {

   private int placeholder;
   
   public Factorial(int placeholder) {
      this.placeholder = placeholder;
   }
   
   public int getFactorial() {
      if (placeholder == 1) return 1;
      Factorial f = new Factorial(placeholder - 1);
      return placeholder * f.getFactorial();
   }

}