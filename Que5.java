//Q. Write a GUI program using components to find sum and difference of two numbers. Use
//two text fields for giving input and a label for output. The program should display sum if
//user presses mouse and difference if user release mouse.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Que5 extends JFrame {
    
    JTextField t1,t2;
    JLabel l1,l2,l3;
    public Que5()
    {
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        l1 = new JLabel("first number : ");
        l2 = new JLabel("second number : ");
        l3 = new JLabel("Output : ");
        JPanel panel = new JPanel();
        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        panel.add(l3);
        
        add(panel);
        t1.addMouseListener(new SumDiff());
        t2.addMouseListener(new SumDiff());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,500);
    }
    
    public class SumDiff extends MouseAdapter{
        
        @Override
        public void mousePressed(MouseEvent e){
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double sum = num1 + num2;
            l3.setText("Sum: "+sum);
        }
        @Override
        public void mouseReleased(MouseEvent e){
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double diff = num1 - num2;
            l3.setText("Difference: "+diff);
        }
    }
    public static void main(String[] args){
        new Que5();
    }

}