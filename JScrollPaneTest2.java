import java.awt.*;
import javax.swing.*;

class JScrollPaneTest2{
    public static void main(String[] args)
    {
        JFrame fr = new JFrame("scroll pane");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(20,1));
        for(int i=1;i<=20;i++)
        {
            panel.add(new JButton("button"+i));
        }
        JScrollPane sp = new JScrollPane(panel,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        fr.add(sp);
        fr.setSize(400,400);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}