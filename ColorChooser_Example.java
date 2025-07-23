// the JColorChooser class is used to create a color chooser dialog box so that user can select any color
import java.awt.*;
import javax.swing.*;
public class ColorChooser_Example extends JFrame{
    ColorChooser_Example()
    {
        JColorChooser cc = new JColorChooser();
        setSize(650,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Parent frame");
        JPanel p = new JPanel();
        add(p);
        setVisible(true);
        Color c = cc.showDialog(this,"Select color",Color.blue);
        p.setBackground(c);

    }
    public static void main(String[] args)
    {
        new ColorChooser_Example();
    }
}