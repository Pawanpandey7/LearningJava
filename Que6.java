/*Q. Design a GUI form using swing with a text field, a text label for displaying the input
message "Input any string", and three buttons with caption "Check Palindrome",
"Reverse", "Find Vowels". Write a complete program for above scenario and for checking
palindrome in first button, reverse it after clicking second button and extract the vowels from
it after clicking third button.*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Que6{
    JLabel l1;
    JTextField tf;
    JButton b1,b2,b3;
    public Que6()
    {
        JFrame fr = new JFrame();
        JPanel panel = new JPanel();
        l1 = new JLabel("enter the string");
        tf = new JTextField(20);
        b1 = new JButton("Check palindrome");
        b2 = new JButton("Reverse");
        b3 = new JButton("Find vowels");
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String str = tf.getText();
                Check_Palindrome(str);
            }
        });
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                 String str = tf.getText();
                 rev_str(str);
            }
           
        });
        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                 String str = tf.getText();
                 find_vowels(str);
            }
        });
        panel.add(l1);
        panel.add(tf);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        fr.add(panel);
        fr.setSize(500,500);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
    public void Check_Palindrome(String str)
    {
       String cleanedInput = str.replace("\\s+","").toLowerCase();
       String reversed = new StringBuilder(cleanedInput).reverse().toString();
       if (cleanedInput.equals(reversed)){
        JOptionPane.showMessageDialog(null,"it is palindrome","checking palindrome",JOptionPane.PLAIN_MESSAGE);
       }else{
        JOptionPane.showMessageDialog(null,"it is not palindrome","checking palindrome",JOptionPane.PLAIN_MESSAGE);
       }

    }
    public void rev_str(String str)
    {
        String cleanedInput = str.replace("\\s+","").toLowerCase();
        String reversed = new StringBuilder(cleanedInput).reverse().toString();
        JOptionPane.showMessageDialog(null,reversed,"reverse of string",JOptionPane.PLAIN_MESSAGE);

    }
    public void find_vowels(String str)
    {
        String vow = "";
        System.out.print("vowels found");
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            vow = vow + ch;    
        }
        JOptionPane.showMessageDialog(null,vow,"printing vowels",JOptionPane.PLAIN_MESSAGE);

    }
    public static void main(String[] args)
    {
        new Que6();
 
    }   
}