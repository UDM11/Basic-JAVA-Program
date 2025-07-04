import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventFullText extends JFrame {
    JLabel promptLabel, displayLabel;
    JTextField textField;

    public KeyEventFullText() {
        setTitle("Event Handling Demo");
        setLayout(new FlowLayout());
        setSize(450, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Components
        promptLabel = new JLabel("Enter any character");
        textField = new JTextField(10);
        displayLabel = new JLabel("Pressed key is ");

        // Add components
        add(promptLabel);
        add(textField);
        add(displayLabel);

        // Add key listener
        textField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String input = textField.getText();
                displayLabel.setText("Pressed key is " + input);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyEventFullText();
    }
}
