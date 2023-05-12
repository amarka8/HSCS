import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class TreeComponent extends JComponent {

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		drawTree(g2, 320, 440, 130, 90);
		// drawTree(g2, 640, 880, 130, 90);
	}

	public void drawTree(Graphics2D g2, double x0, double y0, double len, double angle)
	{
	// len>2 is everything other than the base case (it is a void method so no return statement anyways)
	//decreasing the length will decrease the number of lines and cut off the leaves
		g2.setColor(Color.BLACK);
      if (len >2) {
   		double x1 = x0 + len * Math.cos(Math.toRadians(angle));
   		double y1 = y0 - len * Math.sin(Math.toRadians(angle));
   
   		Line2D.Double line = new Line2D.Double(x0, y0, x1, y1);
		// if(len<30){
		// 	g2.setColor(Color.GREEN);

		// }
   		g2.draw(line);
   		drawTree(g2, x1, y1, len * 0.75, angle + 30);
   		drawTree(g2, x1, y1, len * 0.66, angle -50);
      }
	}
}
