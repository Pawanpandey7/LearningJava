// creating the raised bevel border 
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

class RaisedBevel{
    public static void main(String[] args)
    {
        JFrame fr = new JFrame("creating bevel border");
        JButton button = new JButton("click");
        Border raisedborder = BorderFactory.createRaisedBevelBorder();
        button.setBorder(raisedborder);
        JPanel panel = new JPanel();
        panel.add(button);
        fr.add(panel);
        fr.setVisible(true);
        fr.setSize(400,400);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}