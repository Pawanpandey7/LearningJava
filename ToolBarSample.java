import java.awt.*;
import javax.swing.*;
class ToolBarSample{
    public static void main(String args[])
    {
        JFrame fr = new JFrame("tool bar");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JToolBar tb = new JToolBar();
        
        JButton b1 = new JButton("b1");
        JButton b2 = new JButton("b2");
        JButton b3 = new JButton("b3");
        tb.add(b1);
        tb.addSeparator();
        tb.add(b2);
        tb.addSeparator();
        tb.add(b3);
        JComboBox<String> cb = new JComboBox<>(new String[]{"A","B","C"});
        tb.add(cb);
        Container contentPane = fr.getContentPane();
        contentPane.add(tb,BorderLayout.NORTH);
        JTextArea textarea = new JTextArea();
        JScrollPane pane = new JScrollPane(textarea);
        contentPane.add(pane,BorderLayout.CENTER);
        tb.setRollover(true);
        fr.setVisible(true);
        fr.setSize(400,400);
    }
}