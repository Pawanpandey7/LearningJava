import java.awt.*;
import javax.swing.*;
class JDialogExample{
    public static void main(String args[])
    {
        JFrame fr = new JFrame("JDialog example");
        JLabel label = new JLabel("Name");
        JTextField tf = new JTextField(10);
        JDialog jd = new JDialog();
        fr.add(jd);
        fr.setSize(400,400);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.setTitle("parent frame");
        jd.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        jd.setSize(300,200);
        
        jd.add(label);
        jd.add(tf);
        jd.setVisible(true);
    }
}