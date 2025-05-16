import java.awt.Container;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import static javax.swing.GroupLayout.Alignment.*;

public class GroupExample{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Group Layout");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPanel = frame.getContentPane();

        GroupLayout groupLayout = new GroupLayout(contentPanel);

        contentPanel.setLayout(groupLayout);

        JLabel clickme = new JLabel("click me");
        JButton button = new JButton("this button");

        groupLayout.setHorizontalGroup(
            groupLayout.createSequentialGroup()
            .addComponent(clickme)
            .addGap(10,20,100)
            .addComponent(button)

        );

        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(clickme)
            .addComponent(button)

        );
        frame.pack();
        frame.setVisible(true);
    }
}