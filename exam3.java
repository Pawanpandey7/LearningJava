// i am performing action event in java
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class exam3{
    public static void main(String[] args){
        JFrame fr = new JFrame("sum");
        fr.setLayout(new GridLayout(3,2));
        JLabel label1 = new JLabel("first number: ");
        JTextField tf1 = new JTextField(10);
        fr.add(label1);
        fr.add(tf1);
        JLabel label2 = new JLabel("second  number: ");
        JTextField tf2 = new JTextField(10);
        fr.add(label2);
        fr.add(tf2);

        JButton button = new JButton("submit");
        fr.add(button);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            int a = Integer.valueOf(tf1.getText());
            int b = Integer.valueOf(tf2.getText());
            int c = a + b;
            JOptionPane.showMessageDialog(null,c);
//JOptionPane.showMessageDialog(this, "Enter both fields");

        }
        });
        fr.setVisible(true);
        fr.setSize(400,400);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}