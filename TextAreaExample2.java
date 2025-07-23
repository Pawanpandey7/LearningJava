// practice of the text area control button

import java.awt.*;
import javax.swing.*;

class TextAreaExample2{
    public static void main(String[] args)
    {
        JFrame fr = new JFrame("text area");
        JTextArea txt = new JTextArea();
        txt.setBounds(50,50,100,100);
        fr.add(txt);
        fr.setLayout(null);
        fr.setSize(500,500);
        fr.setVisible(true);
    }
}