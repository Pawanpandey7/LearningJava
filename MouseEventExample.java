import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventExample {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Mouse Event Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Label to display messages
        JLabel label = new JLabel("Interact with the panel using the mouse");
        label.setBounds(50, 20, 300, 30);
        frame.add(label);

        // Panel to attach mouse events
        JPanel panel = new JPanel();
        panel.setBounds(50, 60, 300, 150);
        panel.setBackground(Color.LIGHT_GRAY);

        // Add MouseListener using anonymous inner class
        panel.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }

            public void mousePressed(MouseEvent e) {
                label.setText("Mouse Pressed");
            }

            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse Released");
            }

            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse Entered the panel");
                panel.setBackground(Color.CYAN);
            }

            public void mouseExited(MouseEvent e) {
                label.setText("Mouse Exited the panel");
                panel.setBackground(Color.LIGHT_GRAY);
            }
        });

        // Add panel to frame
        frame.add(panel);

        // Show frame
        frame.setVisible(true);
    }
}
