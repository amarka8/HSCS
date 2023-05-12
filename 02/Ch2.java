import java.awt.*;
public class Ch2 {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle(10,20);
        Rectangle r2=r1;
        r2.translate(5, 7);
        //have the same object reference 
        System.out.println(r1);
    }
}