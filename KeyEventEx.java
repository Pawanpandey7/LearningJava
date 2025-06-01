// The key event is generated in case of key presses and key depresses on text fields such as 
//JTextField and JTextArea. One example of KeyEvent is user typing in a textfield. The listener associated 
//with this class is KeyListener. To handle a key event, a class must implements thr KeyListener interface.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// create a class that extends JFrame to make a window
public class KeyEventEx extends JFrame{
   
   //declare two text fields(input boxes)
    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);
     
    //constructor to setup the gui
    public KeyEventEx()
    {
        setLayout(new FlowLayout());//sets the layout of the window to FlowLayput(left-to-right layout)
        setSize(200,200); // sets the size of the window t0 200*200 pixels
        setVisible(true); // makes the window visible on the screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes the app when window is closed
        add(t1); // adds first text field to the window
        add(t2); // adds second text field to the window
        t2.setEditable(false); // makes second text field read-only(cannot type in it)
        //add keylistener to t1 to react to key events
        t1.addKeyListener(new KeyListener()
        {
            @Override
            public void keyTyped(KeyEvent e){
                //this method is called when a key is typed
                //left empty because we are not doing anything here
            }

            @Override
            public void keyPressed(KeyEvent e){
                //this method is called when a key is pressed(before its released)
                //left empty as well
            }

            @Override
            public void keyReleased(KeyEvent e){
                //this method is called when a key is released(after pressing)
                String copy = t1.getText(); // get the current text from t1
                t2.setText(copy); //set that text into t2 to mirror it
            }
        });
    }
    //Main method - entry point of the program
    public static void main(String[] args)
    {
        new KeyEventEx(); // create an instance of the class(this shows in the window)
    }
}