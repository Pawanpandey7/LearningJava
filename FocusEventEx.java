//The FocusEvent is generated when a component gains or loses keyboard focus. The listener
//for this class is FocusListener. To handle a focus event, a class must implements the
//Focus Listener interface.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FocusEventEx extends JFrame implements FocusListener{
    private JTextField tf1;
    private JTextField tf2;

    public FocusEventEx()
    {
        setTitle("Focus listener example");
        setLayout(new GridLayout(2,1));
        setSize(200,200);
        tf1 = new JTextField();
        tf2 = new JTextField();
        add(tf1);
        add(tf2);
        tf1.addFocusListener(this);
        tf2.addFocusListener(this);
        setVisible(true);

    }
    public void focusGained(FocusEvent e)
    {
        if(e.getSource()== tf1){
            tf1.setBackground(Color.YELLOW);
        }
        else if(e.getSource()==tf2){
            tf2.setBackground(Color.YELLOW);
        }
    }
    public void focusLost(FocusEvent e){
        if(e.getSource()==tf1){
            tf1.setBackground(Color.WHITE);
        }
        else if(e.getSource() ==tf2){
            tf2.setBackground(Color.WHITE);
        }

    }
    public static void main(String[] args)
    {
        new FocusEventEx();
    }


}