import java.awt.*;
public class Other {
    public static void main(String[] args){
    Rectangle r1= new Rectangle(5,10);
    Rectangle r2= new Rectangle(0,10,5,10);
    double areaR1=r1.getWidth() * r1.getHeight();
    double areaR2=r2.getWidth()*r2.getHeight();
    String message="The difference of the two rectangle areas is being displayed: ";
    double difference=areaR1-areaR2;
    System.out.println(message+difference);
    }
}
