// Write a utility class, a class in which all methods are static, incorporating the surface area and volume methods from
// RectangularPrism, Cylinder, and Sphere. Write a class that tests all public methods of the utility
// class.
public class Shape{
        public static double getSurfaceAreaC(double r, double h){
            return 2*((Math.PI*r*h)+(Math.PI*Math.pow(r, 2)));
        }
        public static double getVolumeC(double r, double h){
            return Math.PI*Math.pow(r, 2)*h;
        }
        public static double getSurfaceAreaR(double l, double w, double h){
            return 2*((l*w)+(l*h)+(w*h));
        }
        public static double getVolumeR(double l, double w, double h){
            return l*w*h;
        }
        public static double getSurfaceAreaS(double r){
            return 4*(Math.PI*Math.pow(r, 2));
        }
        public static double getVolumeS(double r){
            return (4.0/3.0)*(Math.PI*Math.pow(r, 3));
        }
        public static void main(String[] args){
            System.out.println("Result is " + Shape.getSurfaceAreaC(5,2)+"," +Shape.getVolumeC(5,2));
            System.out.println("Expected is: " + 219.21 + ","+ 157.08);
            System.out.println("Result is " + Shape.getSurfaceAreaR(5,2,2)+"," +Shape.getVolumeR(5,2,2));
            System.out.println("Expected is: " + 48  + ","+ 20);
            System.out.println("Result is " + Shape.getSurfaceAreaS(5)+"," + Shape.getVolumeS(5));
            System.out.println("Expected is: " + 314.6  + ","+ 523.6 );

        }
}
