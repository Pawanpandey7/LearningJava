import java.awt.*;
import javax.swing.*;


class radioexample2{
    public static void main(String[] args)
    {
        JFrame fr = new JFrame("radios");
        JRadioButton b1 = new JRadioButton("male");
        JRadioButton b2 = new JRadioButton("female");
        b1.setBounds(100,100,200,200);
        b2.setBounds(200,100,200,200);
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        fr.add(b1);
        fr.add(b2);
        fr.setLayout(null);
        fr.setVisible(true);
        fr.setSize(500,500);
    }
}