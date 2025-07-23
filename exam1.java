import javax.swing.*;
import java.awt.*;
public class exam1{
    public static void main(String[] args){
        JFrame fr = new JFrame("some");
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("First number");
        JLabel label2 = new JLabel("Second number");
        JLabel label3 = new JLabel("Result");
        
        JTextField ta1 = new JTextField(20);
        JTextField ta2 = new JTextField(20);
        JTextField ta3 = new JTextField(20);
        JButton b1= new JButton("Additon");
        JButton b2 = new JButton("Subraction");
        JButton b3 = new JButton("Multiplication");
        JButton b4 = new JButton("Division");
        
        panel.add(label1);
        panel.add(ta1);
        panel.add(label2);
        panel.add(ta2);
        panel.add(label3);
        panel.add(ta3);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        fr.add(panel);
        fr.setVisible(true);
        
        fr.setSize(500,500);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    }
}