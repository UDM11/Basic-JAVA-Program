import java.awt.*;
import javax.swing.*;

public class SimpleFormExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Form");

        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");

        button.addActionListener(e -> {
            String name = textField.getText();
            JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
        });

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setSize(300, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
