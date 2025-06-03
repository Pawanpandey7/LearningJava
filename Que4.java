 //Write a program using swing components to find simple interest. Use text fields for inputs
//and output. Your program should display the result when the user presses a button.
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Que4 implements ActionListener{
    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);
    JTextField t3 = new JTextField(10);
    JTextField t4 = new JTextField(10);
    JButton button = new JButton("calculate");
    public Que4()
    {
        JFrame fr = new JFrame();
        fr.setLayout(new FlowLayout());
        JLabel p = new JLabel("Principal: ");
        JLabel t = new JLabel("time: ");
        JLabel r = new JLabel("rate: ");
        fr.add(p);
        fr.add(t1);
        fr.add(t);
        fr.add(t2);
        fr.add(r);
        fr.add(t3);
        fr.add(button);
        fr.add(t4);
        button.addActionListener(this);
        fr.setSize(500,500);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        int p = Integer.parseInt(t1.getText());
        int t = Integer.parseInt(t2.getText());
        int r = Integer.parseInt(t3.getText());
        String si = Integer.toString((p*t*r)/100);
        t4.setText(si);
    }
    public static void main(String[] args)
    {
        new Que4();
    }

}