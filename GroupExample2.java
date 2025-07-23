import java.awt.*;
import javax.swing.*;

class GroupExample2{
    public static void main(String[] args)
    {
        JFrame fr = new JFrame("Group layout manager");
        JLabel label = new JLabel("click");
        JButton button = new JButton("button");
        Container contentpanel = fr.getContentPane();
        GroupLayout grouplayout = new GroupLayout(contentpanel);
        contentpanel.setLayout(grouplayout);
        grouplayout.setHorizontalGroup(
            grouplayout.createSequentialGroup()
            .addComponent(label)
            .addGap(20,30,40)
            .addComponent(button)
        );
        grouplayout.setVerticalGroup(
            grouplayout.createParallelGroup()
            .addComponent(label)
            .addComponent(button)
        );
        fr.setSize(400,400);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}