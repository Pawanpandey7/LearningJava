import javax.swing.*;
import java.awt.*;

public class SliderExample extends JFrame
{
   public SliderExample()
   {
        // create ahorizontal slider that ranges from 0 to 50 with initial value 25
        JSlider slider = new JSlider(JSlider.HORIZONTAL,0,50,25);
        slider.setMinorTickSpacing(2); // set the minor tick spacing to 2
        slider.setMajorTickSpacing(10);// set major tick spacing to 10
        slider.setPaintTicks(true); // tell the slider to actually draw the tick mars
        slider.setPaintLabels(true); // tell the slider to draw the numeric labels for the tick marks
        JPanel panel = new JPanel();// create a panel to hold the slider(Swing uses panels to organize components)
        panel.add(slider);// add the slider to the panel
        add(panel);// add the panel to the JFrame window
        setVisible(true);// make the window visible on the screen
        setSize(400,400);// set the window size to 400 pixels by 400 pixels 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// define what happens when the user closes the window(exit the app)

   }
   // entry ponint of the java application
   public static void main(String[] args)
   {
      // creating an instance of the sliderexample class (this will launch the GUI)
    new SliderExample();
   }
}