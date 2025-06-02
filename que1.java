//Q. Write a program using swing components to add two numbers. Use text fields for inputs
//and output. Your program should display the result when the user presses a button.
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class que1 implements ActionListener{
    JTextField tf1;
    JTextField tf2;
    JButton button;
    JTextField result;
    public que1()
    {
        JFrame fr = new JFrame("sum of two number");
        tf1 = new JTextField(20);
        tf2 = new JTextField(20);
        button = new JButton("add");
        JPanel panel = new JPanel();
        panel.add(tf1);
        panel.add(tf2);
        panel.add(button);
        result = new JTextField(10);
        panel.add(result);
        result.setEditable(false);
        button.addActionListener(this);
        fr.add(panel);
        fr.setSize(500,500);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override 
    public void actionPerformed(ActionEvent e)
    {
        String a = tf1.getText();
        String b = tf2.getText();
        int a1 = Integer.parseInt(a);
        int a2 = Integer.parseInt(b);
        int sum = a1 + a2;
        String str = String.valueOf(sum);

        result.setText(str);
    }
   
    public static void main(String args[])
    {
        new que1();
    }
}