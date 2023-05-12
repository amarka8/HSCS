// Write three classes: RectangularPrism, Cylinder, and Sphere. Write an appropriate constructor for
// each that collects data and assigns it to appropriate instance variables. Include the methods
// getSurfaceArea and getVolume for each class. Use Math class methods and constants when
// possible.
public class RectangularPrism {
    private double l;
    private double w;
    private double h;
    public RectangularPrism(double l, double w, double h){
        this.l=l;
        this.w=w;
        this.h=h;
    }
    public double getSurfaceArea(){
        return 2*((l*w)+(l*h)+(w*h));
    }
    public double getVolume(){
        return l*w*h;
    }
}
