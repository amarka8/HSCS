import javax.swing.JFrame;
public class SpiralFrame {
    public static void main(String[] args){
        JFrame frame= new JFrame();
        frame.setSize(500,500);
        frame.setTitle("A Spiral");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SpiralComponent component= new SpiralComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
