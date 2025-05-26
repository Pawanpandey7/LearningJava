//We can add tooltip text to almost all the components of Java Swing by using the following
//method setToolTipText(String s). This method sets the tooltip of the component to the
//specified string s. When the cursor enters the boundary of that component a popup appears and
//text is displayed.
import java.awt.*;
import javax.swing.*;

class ToolTipExample{
    public static void main(String args[])
    {
        JFrame fr = new JFrame("tool tip example");
        JPanel panel = new JPanel();
        JPasswordField pw = new JPasswordField(20);
        JLabel label = new JLabel("password: ");
        panel.add(label);
        panel.add(pw);
        pw.setToolTipText("enter your password");
        fr.add(panel);
        fr.setSize(500,500);
        fr.setVisible(true);
    }
}