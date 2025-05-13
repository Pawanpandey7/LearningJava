import java.awt.*;
import javax.swing.*;
public class GridBagDemo{
    public static void main(String[] args)
    {
        JFrame fr = new JFrame("GridBag Example");
        JButton b1 = new JButton("b1");
        JButton b2 = new JButton("b2");
        JButton b3 = new JButton("b3");
        JButton b4 = new JButton("b4");
        JButton b5 = new JButton("b5");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cst = new GridBagConstraints();

        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 0;
        cst.gridy = 0;
        panel.add(b1,cst);

        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx =1;
        cst.gridy = 0;
        panel.add(b2,cst);

        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx =2;
        cst.gridy =0;
        panel.add(b3,cst);

        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridwidth = 3;
        cst.gridx = 0;
        cst.gridy = 1;
        panel.add(b4,cst);

        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 2;
        cst.gridy = 2;
        panel.add(b5,cst);

        
        fr.setSize(300,200);
        fr.getContentPane().add(panel);
        fr.setVisible(true);

    }

}