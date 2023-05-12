import java.math.*;
public class Cylinder {
    private double r;
    private double h;
    public Cylinder(double r, double h){
        this.r=r;
        this.h=h;
    }
    public double getSurfaceArea(){
        return 2*((Math.PI*r*h)+(Math.PI*Math.pow(r, 2)));
    }
    public double getVolume(){
        return Math.PI * Math.pow(r, 2)*h;
    }
}
