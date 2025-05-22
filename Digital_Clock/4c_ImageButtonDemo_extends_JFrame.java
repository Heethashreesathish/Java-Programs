/*Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( )*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo extends JFrame {

    private JLabel messageLabel;

    public ImageButtonDemo() {
        setTitle("Image Button Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Load icons (make sure images are in project folder or specify full path)
        // For demonstration, I will use built-in icons from UIManager as placeholders.
        // Replace these with your actual image paths or URLs.
        Icon digitalClockIcon = UIManager.getIcon("OptionPane.informationIcon");
        Icon hourGlassIcon = UIManager.getIcon("OptionPane.warningIcon");

        // Create buttons with images and text
        JButton digitalClockButton = new JButton("Digital Clock", digitalClockIcon);
        JButton hourGlassButton = new JButton("Hour Glass", hourGlassIcon);

        // Position text below icon
        digitalClockButton.setHorizontalTextPosition(SwingConstants.CENTER);
        digitalClockButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        hourGlassButton.setHorizontalTextPosition(SwingConstants.CENTER);
        hourGlassButton.setVerticalTextPosition(SwingConstants.BOTTOM);

        // Message label
        messageLabel = new JLabel("Press a button", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Add action listeners
        digitalClockButton.addActionListener(e -> messageLabel.setText("Digital Clock is pressed"));
        hourGlassButton.addActionListener(e -> messageLabel.setText("Hour Glass is pressed"));

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(digitalClockButton);
        buttonPanel.add(hourGlassButton);

        // Layout
        setLayout(new BorderLayout(10, 10));
        add(buttonPanel, BorderLayout.CENTER);
        add(messageLabel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ImageButtonDemo().setVisible(true);
        });
    }
}
