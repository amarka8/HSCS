import javax.swing.JFrame;
public class Frame {
    public static void main(String[] args){
        JFrame frame= new JFrame();
        frame.setSize(200,225);
        frame.setTitle("A Checkerboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RectangleComponent component= new RectangleComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
