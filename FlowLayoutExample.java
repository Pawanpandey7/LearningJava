import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class FlowLayoutExample{
    FlowLayoutExample(){
        JFrame f = new JFrame("anything");
        JButton b1 = new JButton("buttton 1");
        JButton b2 = new JButton("button 2");
        JButton b3 = new JButton("button 3");
        JButton b4 = new JButton("button 4");
        JButton b5 = new JButton("button 5");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.setLayout(new FlowLayout());
        f.setSize(300,300);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new FlowLayoutExample();
    }
}