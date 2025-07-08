import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Student Registration");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        
        // Components
        JLabel firstNameLabel = new JLabel("First Name");
        JTextField firstNameField = new JTextField(15);

        JLabel lastNameLabel = new JLabel("Last Name");
        JTextField lastNameField = new JTextField(15);

        JLabel emailLabel = new JLabel("Email ID");
        JTextField emailField = new JTextField(15);

        JLabel phoneLabel = new JLabel("Phone No.");
        JTextField phoneField = new JTextField(15);

        JButton registerButton = new JButton("Register");
        JButton clearButton = new JButton("Clear");

        // Layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0; gbc.gridy = 0;
        frame.add(firstNameLabel, gbc);
        gbc.gridx = 1;
        frame.add(firstNameField, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        frame.add(lastNameLabel, gbc);
        gbc.gridx = 1;
        frame.add(lastNameField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        frame.add(emailLabel, gbc);
        gbc.gridx = 1;
        frame.add(emailField, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        frame.add(phoneLabel, gbc);
        gbc.gridx = 1;
        frame.add(phoneField, gbc);

        gbc.gridx = 0; gbc.gridy = 4;
        frame.add(registerButton, gbc);
        gbc.gridx = 1;
        frame.add(clearButton, gbc);

        // Action listeners
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "User registered");
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNameField.setText("");
                lastNameField.setText("");
                emailField.setText("");
                phoneField.setText("");
            }
        });

        // Make frame visible
        frame.setVisible(true);
    }
}
