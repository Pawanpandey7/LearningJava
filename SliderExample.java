import javax.swing.*;
import java.awt.*;

public class SliderExample extends JFrame
{
   public SliderExample()
   {
        JSlider slider = new JSlider(JSlider.HORIZONTAL,0,50,25);
        slider.setMinorTickSpacing(2); // set the minor tick spacing to the slider
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }
   public static void main(String[] args)
   {
    new SliderExample();

   }

}