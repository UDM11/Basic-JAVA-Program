import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApplication extends JFrame {
    private JTextField counterField;
    private int counterValue = 0;

    public CounterApplication() {
        // Set up the main frame
        setTitle("Counter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 1));

        // Create the title panel
        JPanel titlePanel = new JPanel();
        titlePanel.add(new JLabel("Counter"));
        mainPanel.add(titlePanel);

        // Create the counter panel
        JPanel counterPanel = new JPanel();
        counterPanel.setLayout(new FlowLayout());

        // Create and configure the counter text field
        counterField = new JTextField(10);
        counterField.setText("0");
        counterField.setHorizontalAlignment(JTextField.CENTER);
        counterField.setEditable(false);
        counterPanel.add(counterField);

        // Create buttons
        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");
        JButton resetButton = new JButton("Reset");

        // Add buttons to panel
        counterPanel.add(upButton);
        counterPanel.add(downButton);
        counterPanel.add(resetButton);

        // Add counter panel to main panel
        mainPanel.add(counterPanel);

        // Add main panel to frame
        add(mainPanel, BorderLayout.CENTER);

        // Add action listeners
        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterValue++;
                counterField.setText(String.valueOf(counterValue));
            }
        });

        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterValue--;
                counterField.setText(String.valueOf(counterValue));
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterValue = 0;
                counterField.setText("0");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CounterApplication app = new CounterApplication();
                app.setVisible(true);
            }
        });
    }
}