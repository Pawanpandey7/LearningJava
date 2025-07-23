// Combo box is a combination of text fields and drop-down list. JComboBox component is used
// to create a combo box in Swing. Following is the constructor for JComboBox:
// JComboBox(String arr[])
import java.awt.*;
import javax.swing.*;

public class comboboxex{
   
    public static void main(String[] args)
    {
        JFrame fr = new JFrame("combo box ");
        fr.setLayout(new FlowLayout());
        String name[] = {"pawan","sagar","oli"};
   
        JComboBox<String> cb = new JComboBox<>(name);
        fr.add(cb);
        fr.setSize(500,500);
        fr.setVisible(true);
    }   
}