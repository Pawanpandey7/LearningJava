// creating grid 
import java.awt.*;
import javax.swing.*;

public class GridDemo{
    GridDemo()
    {
        JFrame f = new JFrame("Gird demo");
        JButton b1 = new JButton("b1");
        JButton b2 = new JButton("b2");
        JButton b3 = new JButton("b3");
        JButton b4 = new JButton("b4");
        JButton b5 = new JButton("b5");
        JButton b6 = new JButton("b6");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);

        f.setLayout(new GridLayout(2,3));
        f.setSize(300,300);
        f.setVisible(true);
    }

    public static void main(String[] args)
    {
        new GridDemo();
    }


}
