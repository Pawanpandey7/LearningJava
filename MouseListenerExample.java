import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseListenerExample implements MouseListener{
    JButton btn;
    public MouseListenerExample()
    {
        JFrame fr = new JFrame("mouse listener");
        btn = new JButton("click");
        fr.add(btn);
        fr.setVisible(true);
        fr.setSize(500,500);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e)
    {
        btn.setText("clicked");
    }
    public void mouseEntered(MouseEvent e){
        btn.setBackground(Color.RED);
    }
    public void mouseExited(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public static void main(String[] args)
    {
        new MouseListenerExample();
    }
}