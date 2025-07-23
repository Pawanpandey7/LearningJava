import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginForm extends JFrame {
    private JTextField userIdField;
    private JPasswordField passwordField;
    private JButton okButton, cancelButton;

    public LoginForm() {
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // UI components
        add(new JLabel("User ID:"));
        userIdField = new JTextField();
        add(userIdField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        add(okButton);
        add(cancelButton);

        // Button actions
        okButton.addActionListener(e -> performLogin());
        cancelButton.addActionListener(e -> clearFields());

        // Key events
        KeyAdapter keyHandler = new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                if (ch == 'l') {
                    performLogin();
                } else if (ch == 'c') {
                    clearFields();
                }
            }
        };

        userIdField.addKeyListener(keyHandler);
        passwordField.addKeyListener(keyHandler);

        setVisible(true);
    }

    private void performLogin() {
        String uid = userIdField.getText();
        String password = String.valueOf(passwordField.getPassword());

        if (uid.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter both fields");
            return;
        }

       

    }

    private void clearFields() {
        userIdField.setText("");
        passwordField.setText("");
        userIdField.requestFocus();
    }

    public static void main(String[] args) {
        // Load MySQL JDBC driver (optional for newer JDBC versions)
       

        new LoginForm();
    }
}
