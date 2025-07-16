import java.awt.event.*;
import javax.swing.*;

public class MouseExample extends JFrame implements MouseListener {
    JLabel label;

    public MouseExample() {
        setTitle("Mouse Event Example");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label = new JLabel("Click anywhere!");
        label.setBounds(100, 50, 150, 30);
        add(label);

        addMouseListener(this);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseExample();
    }
}
