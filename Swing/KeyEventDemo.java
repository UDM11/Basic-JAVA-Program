import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventDemo extends JFrame implements KeyListener {
    JLabel promptLabel, displayLabel;
    JTextField textField;

    public KeyEventDemo() {
        setTitle("Event Handling Demo");
        setLayout(new FlowLayout());
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        promptLabel = new JLabel("Enter any character");
        textField = new JTextField(10);
        displayLabel = new JLabel("Pressed key is ");

        add(promptLabel);
        add(textField);
        add(displayLabel);

        textField.addKeyListener(this);

        setVisible(true);
    }

    // KeyListener methods
    public void keyTyped(KeyEvent e) {
        displayLabel.setText("Pressed key is " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new KeyEventDemo();
    }
}
