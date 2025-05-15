import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class EventHandling extends JFrame implements ActionListener
{
    JTextField tf;
    EventHandling()
    {
        tf = new JTextField();
        tf.setBounds(60,50,170,20);
        JButton button = new JButton("Show");
        button.addActionListener(this);
        add(button);
        add(tf);
        setSize(250,250);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("hello world");
    }
    public static void main(String[] args)
    {
        new EventHandling();
    }
}