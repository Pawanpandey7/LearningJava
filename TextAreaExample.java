// i will create the text area 
import java.awt.*;
import javax.swing.*;

class TextAreaExample{
    public static void main(String[] args)
    {
        JFrame fr = new JFrame("text area example");
        JTextArea txt = new JTextArea();
        txt.setBounds(40,50,100,100);
        fr.add(txt);
        fr.setLayout(null);
        fr.setVisible(true);
        fr.setSize(300,300);
    }
}