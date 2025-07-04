import java.awt.event.*;
import javax.swing.*;

public class ActionListenerExample {

    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("ActionListener Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create a button
        JButton button = new JButton("Click Me");
        button.setBounds(100, 50, 100, 30);

        // Create a label
        JLabel label = new JLabel("Button not clicked yet.");
        label.setBounds(70, 100, 200, 30);

        // Add ActionListener to the button
        button.addActionListener((ActionEvent e) -> {
            label.setText("Button clicked!");
        });

        // Add components to frame
        frame.add(button);
        frame.add(label);

        // Set frame visible
        frame.setVisible(true);
    }
}