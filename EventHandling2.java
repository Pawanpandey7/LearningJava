import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class EventHandling2 implements ActionListener{
    JTextField tf;
    public EventHandling2()
    {
        JFrame fr = new JFrame("evenrs");
        tf = new JTextField(20);
        JButton btn = new JButton("show");
        JPanel panel = new JPanel();
        panel.add(tf);
        panel.add(btn);
        fr.add(panel);
        btn.addActionListener(this);
        fr.setVisible(true);
        fr.setSize(500,500);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("hello");
    }
    public static void main(String args[])
    {
        new EventHandling2();
    }
}