/*Adapter Classes
Many of the listener interfaces have more than one method. When we implement a listener
interface in any class then we must have to implement all the methods declared in that interface
because all the methods in an interface are final and must be override in class which implement
1t. Adapter class makes it easy to deal with this situation.
An adapter class provides empty implementations of all methods defined by that interface.
Adapter classes are very useful if we want to override only some of the methods defined by
that interface. We can define a new class to act as an event listener by extending  one of the
adapter classes and implementing only those events in which we are interested.
For example, the KeyListener interface contains three methods KeyPressed, KeyReleasedO
and KeyTypedO. If we implement this interface, we have to give implementation of all these
three methods. However, by using the KeyAdapter class, we can override only the method that
is needed. This can be shown in the code example given below:*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyAdapterExample extends JFrame{
    JLabel outputlabel;
    public KeyAdapterExample(){
        setTitle("Key Adaper Example");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        outputlabel = new JLabel("press a key");
        add(outputlabel);
        addKeyListener(new CustomKeyAdapter());
        setVisible(true);
    }
    class CustomKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            outputlabel.setText("Key pressed"+e.getKeyChar());
        }
        @Override
        public void keyReleased(KeyEvent e)
        {
            outputlabel.setText("Key Released: "+ e.getKeyChar());
        }
    }
    public static void main(String[] args)
    {
        new KeyAdapterExample();
    }
}