import javax.swing.*;

public class SimpleForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Form");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Absolute positioning

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 20, 50, 25);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(90, 20, 150, 25);
        frame.add(nameField);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(90, 60, 100, 30);
        frame.add(submitButton);

        // Button action
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
        });

        frame.setVisible(true);
    }
}