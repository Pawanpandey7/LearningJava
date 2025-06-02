//Q. Write a program using swing components to find simple interest. Use text fields for inputs
//and output. Your program should display the result when the user presses a button.
import javax.swing.*;
import java.awt.event.*;
public class Que3 implements ActionListener{
    JLabel l1,l2;
    JTextArea area;
    JButton b;
    Que3()
    {
        JFrame f = new JFrame();
        l1 = new JLabel();
        l1.setBounds(50,25,100,30);
        l2 = new JLabel();
        l2.setBounds(160,25,100,30);
        area = new JTextArea();
        area.setBounds(20,75,250,200);
        b = new JButton("Count words");
        b.setBounds(100,300,120,30);
        b.addActionListener(this);
        f.add(l1);
        f.add(l2);
        f.add(area);
        f.add(b);
        f.setSize(450,450);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String text = area.getText();
        String words[] = text.split(" ");
        l1.setText("Words: "+words.length);
        l2.setText("Characters :"+ text.length());

    }
    public static void main(String[] args)
    {
        new Que3();

    }
}