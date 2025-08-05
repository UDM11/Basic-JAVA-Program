import java.awt.event.*;
import javax.swing.*;

public class RegistrationForm {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        // First Name
        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setBounds(20, 20, 100, 25);
        panel.add(firstNameLabel);

        JTextField firstNameField = new JTextField();
        firstNameField.setBounds(140, 20, 200, 25);
        panel.add(firstNameField);

        // Last Name
        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setBounds(20, 60, 100, 25);
        panel.add(lastNameLabel);

        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(140, 60, 200, 25);
        panel.add(lastNameField);

        // Email ID
        JLabel emailLabel = new JLabel("Email ID:");
        emailLabel.setBounds(20, 100, 100, 25);
        panel.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(140, 100, 200, 25);
        panel.add(emailField);

        // Password
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 140, 100, 25);
        panel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(140, 140, 200, 25);
        panel.add(passwordField);

        // Register Button
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(70, 200, 100, 30);
        panel.add(registerButton);

        // Clear Button
        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(200, 200, 100, 30);
        panel.add(clearButton);

        // Action for Register button
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,
                    "User Registered",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Action for Clear button
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNameField.setText("");
                lastNameField.setText("");
                emailField.setText("");
                passwordField.setText("");
            }
        });

        // Make frame visible
        frame.setVisible(true);
    }
}
