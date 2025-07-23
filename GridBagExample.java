import javax.swing.*;
import java.awt.*;

public class GridBagExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        // Label
        JLabel label = new JLabel("Username:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        frame.add(label, gbc);

        // Text Field
        JTextField textField = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(textField, gbc);

       
        frame.setVisible(true);
    }
}
