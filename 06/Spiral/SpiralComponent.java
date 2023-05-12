import java.awt.*;
import javax.swing.JComponent;
import java.awt.geom.Line2D;
public class SpiralComponent extends JComponent {
    public void paintComponent(Graphics g){
        Graphics2D g2=(Graphics2D) g;
        int z=100;
        int x1=300;
        int y1=300;
        int x=0;
        for(int i=0;i<7;i++){
            Line2D.Double line= new Line2D.Double(x1,y1,x1,y1+z);
            g2.setColor(Color.CYAN);
            g2.draw(line);
            Line2D.Double line2= new Line2D.Double(x1,y1+z,x1-z+x,y1+z);
            g2.setColor(Color.CYAN);
            g2.draw(line2);
            Line2D.Double line3= new Line2D.Double(x1-z+x,y1+z,x1-z+x,y1+x);
            g2.setColor(Color.CYAN);
            g2.draw(line3);
            int q=z-10;
            Line2D.Double line4= new Line2D.Double(x1-z+x,y1+x,x1-z+q,y1+x);
            g2.setColor(Color.CYAN);
            g2.draw(line4);
            x1=x1-z+q;
            z=q;
            x+=10;
        }
    }
}
