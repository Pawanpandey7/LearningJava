import javax.swing.*;
import java.awt.*;

public class JScrollPaneTest extends JFrame{
    JScrollPaneTest(){
        setTitle("JScrollPane Test");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(20,1));
        // add buttons as sample content
        for(int i=1;i<=20;i++)
        {
            panel.add(new JButton("Button "+i));
        }
        JScrollPane jsp = new JScrollPane(panel,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        add(jsp);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new JScrollPaneTest();
    }
}