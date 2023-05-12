public class Sphere {
    private double r;
    public Sphere(double r){
        this.r=r;
    }
    public double getSurfaceArea(){
        return 4*(Math.PI*Math.pow(r, 2));
    }
    public double getVolume(){
        return (4.0/3.0)*(Math.PI*Math.pow(r, 3));
    }
}
