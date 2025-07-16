import java.awt.*;
import javax.swing.*;

public class AllSwingComponentsExample extends JFrame {

    public AllSwingComponentsExample() {
        // Set title and layout
        setTitle("Swing Components Example");
        setLayout(new FlowLayout());

        // JLabel
        JLabel nameLabel = new JLabel("Enter your name:");

        // JTextField
        JTextField nameField = new JTextField(20);

        // JTextArea
        JTextArea addressArea = new JTextArea(5, 20);
        addressArea.setBorder(BorderFactory.createTitledBorder("Address"));

        // JCheckBox
        JCheckBox termsCheck = new JCheckBox("Accept Terms");

        // JRadioButton
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        // JComboBox
        String[] countries = {"Nepal", "India", "USA"};
        JComboBox<String> countryBox = new JComboBox<>(countries);

        // JButton
        JButton submitButton = new JButton("Submit");

        // Action Listener for button
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String address = addressArea.getText();
            boolean accepted = termsCheck.isSelected();
            String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "Not Selected");
            String country = (String) countryBox.getSelectedItem();

            if (!accepted) {
                JOptionPane.showMessageDialog(this, "You must accept the terms to proceed.");
                return;
            }

            String message = "Name: " + name +
                             "\nGender: " + gender +
                             "\nCountry: " + country +
                             "\nAddress: " + address;

            JOptionPane.showMessageDialog(this, message);
        });

        // Add all components to frame
        add(nameLabel);
        add(nameField);
        add(male);
        add(female);
        add(new JLabel("Select Country:"));
        add(countryBox);
        add(addressArea);
        add(termsCheck);
        add(submitButton);

        // Set default settings
        setSize(350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AllSwingComponentsExample();
    }
}
