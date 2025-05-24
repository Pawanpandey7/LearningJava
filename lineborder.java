// creating line border 
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

class lineborder{
    public static void main(String args[])
    {
        JFrame fr = new JFrame("line border");
        JButton button = new JButton("click");
        Border lineb = BorderFactory.createLineBorder(Color.RED,1);
        button.setBorder(lineb);
        JPanel panel = new JPanel();
        panel.add(button);
        fr.add(panel);
        fr.setVisible(true);
        fr.setSize(500,500);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}