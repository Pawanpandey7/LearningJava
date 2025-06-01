//Item event is generated whenever user selects or deselects a selectable object such as radio
//button, checkbox or list. To handle an item event, a class must implement the ItemListener
//interface.

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ItemListenerExample implements ItemListener{
    JFrame frame;
    JCheckBox checkbox;
    JLabel label;
    public ItemListenerExample()
    {
        frame = new JFrame("Item Listener example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkbox = new JCheckBox("Check me");
        label = new JLabel();
        checkbox.addItemListener(this);
        JPanel panel = new JPanel();
        panel.add(checkbox);
        panel.add(label);
        frame.add(panel);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getStateChange() == ItemEvent.SELECTED){
            label.setText("Checkbox is checked");
        }
        else if (e.getStateChange() == ItemEvent.DESELECTED){
            label.setText("Checkbox is unchecked");
        }
    }
    public static void main(String[] args)
    {
        new ItemListenerExample();
    }

}