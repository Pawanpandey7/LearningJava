// handing key events
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventEx2 extends JFrame 
{
    JTextField tf1 = new JTextField(20);
    JTextField tf2 = new JTextField(20);

    public KeyEventEx2()
    {
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
        add(tf1);
        add(tf2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf2.setEditable(false);
        tf1.addKeyListener(new KeyListener()
        {
            @Override
            public void keyTyped(KeyEvent e){

            }
            @Override 
            public void keyPressed(KeyEvent e){

            }
            @Override 
            public void keyReleased(KeyEvent e)
            {
                String copy = tf1.getText();
                tf2.setText(copy);
            }
        });
        
    }
    public static void main(String[] args)
        {
            new KeyEventEx2();
        }
}
