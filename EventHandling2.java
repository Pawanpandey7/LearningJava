import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EventHandling2 implements ActionListener{
    JTextField tf;
    EventHandling2(){
        JFrame fr = new JFrame("event");
        tf = new JTextField();
        tf.setBounds(100,100,150,200);
        JButton button = new JButton("show");
        button.setBounds(250,100,100,200);
        button.addActionListener(this);
        fr.setLayout(null);
        fr.add(tf);
        fr.add(button);
        fr.setSize(500,500);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


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