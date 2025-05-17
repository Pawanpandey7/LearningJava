// no layout manager: We manually position and arrange the items

import javax.swing.*;
import java.awt.*;

class NoLayout{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("no Layout Manager");
        JLabel label = new JLabel("clickme");
        JButton button = new JButton("button");
        label.setBounds(50,100,95,30);
        button.setBounds(100,100,95,30);
        frame.add(label);
        frame.add(button);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);


    }
}