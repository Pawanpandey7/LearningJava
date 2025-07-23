import java.awt.*;
import javax.swing.*;
class Addition2{
    public static void main(String[] args)
    {
        String sn1 = JOptionPane.showInputDialog("enter first integer");
        String sn2 = JOptionPane.showInputDialog("enter second integer");

        // convering the sting to integer

        int n1 = Integer.parseInt(sn1);
        int n2 = Integer.parseInt(sn2);
        JOptionPane.showMessageDialog(null,"the sum of two integeres is "+(n1+n2),"sum of integers",JOptionPane.PLAIN_MESSAGE);
        
    }
}