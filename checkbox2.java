import java.awt.*;
import javax.swing.*;

class checkbox2{
    public static void main(String[] args)
    {
        JFrame fr = new JFrame("check box example");
        JCheckBox cb1 = new JCheckBox("maths");
        JCheckBox cb2 = new JCheckBox("english");
        cb1.setBounds(100,100,100,100);
        cb2.setBounds(200,100,100,100);
        fr.add(cb1);
        fr.add(cb2);
        fr.setLayout(null);
        fr.setSize(500,500);
        fr.setVisible(true);
    }
}