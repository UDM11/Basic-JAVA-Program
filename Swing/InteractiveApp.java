import java.awt.*;
import javax.swing.*;

public class InteractiveApp extends JFrame {

    public InteractiveApp() {
        // Frame setup
        setTitle("Interactive Form");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Components
        JLabel nameLabel = new JLabel("Enter your name:");
        JTextField nameField = new JTextField(15);

        JLabel countryLabel = new JLabel("Select your country:");
        String[] countries = {"Nepal", "India", "USA"};
        JComboBox<String> countryBox = new JComboBox<>(countries);

        JButton submitButton = new JButton("Greet Me");

        // Output label
        JLabel outputLabel = new JLabel("");

        // Event handling
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String country = (String) countryBox.getSelectedItem();
            outputLabel.setText("Hello " + name + " from " + country + "!");
        });

        // Add to frame
        add(nameLabel);
        add(nameField);
        add(countryLabel);
        add(countryBox);
        add(submitButton);
        add(outputLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new InteractiveApp();
    }
}
