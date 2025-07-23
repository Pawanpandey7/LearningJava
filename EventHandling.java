import java.awt.*;
import java.awt.event.*; // includes classes for handling events

import javax.swing.*;
//creating a class 'EventHandling' that extends JFrame (a window) and implements ActionListener (to handle button clicks)
class EventHandling extends JFrame implements ActionListener
{
    JTextField tf; // declaring a text field object to display text
    //constructor to set up the GUI
    EventHandling()
    {
        tf = new JTextField(); //creating a new text field
        tf.setBounds(60,50,170,20); //setting position (x,y) and size (width,height) of text field
        JButton button = new JButton("Show");
        button.setBounds(40,50,170,20); //creating a new button with label "Show"
        button.addActionListener(this); // registering current class(this) as the action listener for the button
        add(button); // adding the button to the frame
        add(tf);  // adding th etext fiels to the frame
        setSize(250,250); // setting the size of the window (width,height)
        setLayout(null); // using no layout manager - allows absolute positioning
        setVisible(true); // making the window visible
    }
    //overriding the actionPerformed method to define what happens when the button is clicked
    @Override
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("hello world"); //setting the text of the text field to "hello world"
    }
    public static void main(String[] args)
    {
        new EventHandling(); //creating an object of EventHandling to run the GUI
    }
    
}
