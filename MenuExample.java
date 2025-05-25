import java.awt.*;
import javax.swing.*;

class MenuExample{
    public static void main(String args[])
    {
        JFrame fr = new JFrame("menu and submenu");
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("menu");
        JMenu submenu = new JMenu("submenu");
        JPanel panel = new JPanel();
        ImageIcon icon = new ImageIcon("/Users/madridista/Desktop/container/imp.jpeg");
        
        Image image = icon.getImage(); // get Image object from ImageIcon
        Image scaledImage = image.getScaledInstance(20, 20, Image.SCALE_SMOOTH); // width, height, scaling hint
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JMenuItem i1 = new JMenuItem("1",scaledIcon);
        JMenuItem i2 = new JMenuItem("2");
        JMenuItem i3 = new JMenuItem("3");
        JMenuItem i4 = new JMenuItem("4");
        JMenuItem i5 = new JMenuItem("5");
        mb.add(menu);
        panel.add(mb);
        fr.add(panel);
        menu.add(i1);
        menu.add(i2);
        submenu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        fr.setVisible(true);
        fr.setSize(500,500);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}