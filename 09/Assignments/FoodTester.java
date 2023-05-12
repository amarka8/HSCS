public class FoodTester {

   public static void main (String[] args) {
   
      /*
      1) Assign without casting...
      	Is the variable type on the right a subclass of the one on the left?
	      Or, is a __ a ___?
	      If yes, no compiler error; if not, then compiler error. Run-time error not possible.

      2) Assign with casting...
      	a) Does the cast work at compile-time?
      		Is the variable type in the hierarchy of casting type? Can be a subclass or superlass.
            If yes, no compiler error (run-time error still possible); if not, then compiler error.
      	b) Does the assignment work at compile-time?
      		Is the casting type on the right a subclass of the variable type on the left?
            If yes, no compiler error (run-time error still possible); if not, then compiler error.
      	c) Does the cast work at run-time?
      		Is the object type the class or a subclass of the casting type?
      		If yes, cast works; if not, ClassCastException.
      	d) Does the assignment work at run-time?
      		Yes, if all of the above have passed, there's no way for it to not work.
      */
   
      Object object = new Object();
      String string = "";
      Food food = new Food();
      Fruit fruit = new Fruit();
      Lemon lemon = new Lemon();
      Pizza pizza = new Pizza();
      
      // does it compile and run?
      
      /*
      1) Assign without casting...
      	Is the variable type on the right a subclass of the one on the left?
	      Or, is a __ a ___?
	      If yes, no compiler error; if not, then compiler error. Run-time error not possible.
      */
      /*
      food = fruit; // Is a Fruit and Food? Yes!
      food = lemon;
      food = pizza;
      object = pizza; // Is a Pizza an Object? Yes!
      object = string;
      */
      /*
      fruit = food; // Is a Food a Fruit? No!
      lemon = object;
      pizza = string; // Is a String a Pizza? No!
      string = food;
      */

      /*      
      2) Assign with casting...
      	a) Does the cast work at compile-time?
      		Is the variable type in the hierarchy of casting type or vice versa? Can be a subclass or superlass.
            If yes, no compiler error (run-time error still possible); if not, then compiler error.
      	b) Does the assignment work at compile-time?
      		Is the casting type on the right a subclass of the variable type on the left?
            If yes, no compiler error (run-time error still possible); if not, then compiler error.
      	c) Does the cast work at run-time?
      		Is the object type the class or a subclass of the casting type?
      		If yes, cast works; if not, ClassCastException.
      */
      /*
      food = lemon;
      object = pizza;
      fruit = (Fruit)food; 
         // Is Food in Fruit's hierarchy or vice versa? Yes! Cast works at compile-time. 
         // Is a Fruit a Fruit? Yes! Assignment works at compile time.
         // Does food refer to a Fruit? Yes (a Lemon)! Cast works at run-time.
      lemon = (Lemon)food;
         // Is Food in Lemon's hierarchy or vice versa? Yes! Cast works at compile-time. 
         // Is a Lemon a Lemon? Yes! Assignment works at compile time.
         // Does food refer to a Lemon? Yes! Cast works at run-time.
      food = (Pizza)object;
         // Is a Object in Pizza's hierarchy or vice versa? Yes! Cast works at compile-time. 
         // Is a Pizza a Food? Yes! Assignment works at compile time.
         // Does object refer to a Food? Yes (a Pizza)! Cast works at run-time.
      object = (Object)pizza;
         // Is a Pizza in Object's hierarchy or vice versa? Yes! Cast works at compile-time. 
         // Is a Object an Object? Yes! Assignment works at compile time.
         // Does pizza refer to an Object? Yes (a Pizza)! Cast works at run-time.
         // Cast is however not needed since assignment of subclass type to superclass type works without a cast.
      */
      
      /*      
      2) Assign with casting...
      	a) Does the cast work at compile-time?
      		Is the variable type in the hierarchy of casting type or vice versa? Can be a subclass or superlass.
            If yes, no compiler error (run-time error still possible); if not, then compiler error.
      	b) Does the assignment work at compile-time?
      		Is the casting type on the right a subclass of the variable type on the left?
            If yes, no compiler error (run-time error still possible); if not, then compiler error.
      	c) Does the cast work at run-time?
      		Is the object type the class or a subclass of the casting type?
      		If yes, cast works; if not, ClassCastException.
      */
      /*
      object = (Fruit)pizza;
         // Is Pizza in Fruit's hierarchy or vice versa? No! Compiler error. 
      string = (Lemon)food;
         // Is Food in Lemons's hierarchy or vice versa? Yes! Cast works at compile-time. 
         // Is a Lemon a String? No! Compiler error.
      fruit = (Fruit)food;
         // Is Food in Fruit's hierarchy or vice versa? Yes! Cast works at compile-time. 
         // Is a Fruit a Fruit? Yes! Assignment works at compile time.
         // Does food refer to a Fruit? No (a Food)! ClassCastException!
      */      
      
      
   }

}