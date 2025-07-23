// file choosers provide a GUI for navigating the file system and then either choosing a file or 
//directory from a lost or entering the name of a file or directory. To display a file chooser, we usually use
//the JFileChooser API to show a modal dialog containing the file chooser

import java.awt.*;
import javax.swing.*;
public class filechoserExample extends JFrame{
    filechoserExample()
    {
        JFileChooser jf = new JFileChooser();
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Parent Frame");
        setVisible(true);
        jf.showOpenDialog(this);
    }
    public static void main(String[] args)
    {
        new filechoserExample();
    }
}