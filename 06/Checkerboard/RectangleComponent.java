import java.awt.*;
import javax.swing.JComponent;
public class RectangleComponent extends JComponent {
    public void paintComponent(Graphics g){
        Graphics2D g2=(Graphics2D) g;
        g2.setColor(Color.BLACK);
        Rectangle box= new Rectangle(0,0,25,25);
        g2.fill(box);
        int move1=50;
        int move2=25;
        int sign=-1;
        for (int z=0;z<8;z++){
            for (int i=0;i<3;i++){
                box.translate(move1,0);
                g2.fill(box);
            }
            box.translate(move2, 25);
            g2.fill(box);
            move1*=sign;
            move2*=sign;
        }
    }
}
