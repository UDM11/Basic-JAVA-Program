import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class KeyExample extends JFrame implements KeyListener {
    JLabel label;

    public KeyExample() {
        setTitle("Key Event Example");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTextField textField = new JTextField(15);
        label = new JLabel("Press any key");

        textField.addKeyListener(this);
        add(textField);
        add(label);

        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new KeyExample();
    }
}
