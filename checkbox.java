//The JCheckBox class is used to create a checkbox. It is used to turn an option on (true) or off
//(false). Clicking on a CheckBox changes its state from "on" to "off" or from "off" to "on".

import java.awt.*;
import javax.swing.*;

class checkbox extends JFrame
{
    public checkbox(){
        JCheckBox cb1 = new JCheckBox("yes");
        add(cb1);
        JCheckBox cb2 = new JCheckBox("No");
        add(cb2);
        JCheckBox cb3 = new JCheckBox("maybe");
        add(cb3);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);

    }
    public static void main(String[] args)
    {
        new checkbox();
    }
    
}