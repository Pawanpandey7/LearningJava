import java.awt.*;
import javax.swing.*;

class NoLayout2{
    public static void main(String[] args)
    {
        JFrame fr = new JFrame("No layout manager");
        JLabel label = new JLabel("Click");
        JButton button = new JButton("button");
        label.setBounds(100,100,300,300);
        button.setBounds(200,100,300,300);
        fr.add(label);
        fr.add(button);
        fr.setLayout(null);
        fr.setVisible(true);
        fr.setSize(500,500);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}