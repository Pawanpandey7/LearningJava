// Swing GUI Controls
/*JLabel
The object of Label class is a component for placing text in a container. It is used to display a
single line of read only text. The text can be changed by an application but a user cannot edit
it directly.*/

import javax.swing.*;

class labelexample{
    public static void main(String[] args)
    {
        JFrame fr = new JFrame("Label example");
        JLabel label = new JLabel("this is label");
        label.setBounds(50,50,60,60);
        fr.add(label);
        fr.setVisible(true);
        fr.setSize(100,100);
    }
}