import java.awt.*;
import javax.swing.*;

public class IFExample extends JFrame{
    IFExample(){
        JDesktopPane dp = new JDesktopPane();
        JInternalFrame jif = new JInternalFrame("internal frame",true,true,true,true);
        JTextField tf = new JTextField(10);
        JLabel lb = new JLabel("Name:");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        jif.setSize(200,200);
        jif.setLocation(50,50);
        dp.add(jif);
        add(dp);
        jif.setLayout(new FlowLayout(FlowLayout.CENTER));
        jif.add(lb);
        jif.add(tf);
        jif.setVisible(true);

    }
    public static void main(String[] args)
    {
        new IFExample();
    }
}