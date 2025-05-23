/*Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
event handling mechanism with addActionListener( )*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonPress extends JFrame {

    private JLabel messageLabel;

    public CountryButtonPress() {
        setTitle("Country Button Press");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center window

        // Create buttons
        JButton srilankaButton = new JButton("Srilanka");
        JButton indiaButton = new JButton("India");

        // Message label
        messageLabel = new JLabel("Press a button", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 18));

        // Add ActionListener to Srilanka button
        srilankaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Srilanka is pressed");
            }
        });

        // Add ActionListener to India button
        indiaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("India is pressed");
            }
        });

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(srilankaButton);
        buttonPanel.add(indiaButton);

        // Layout setup
        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.CENTER);
        add(messageLabel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CountryButtonPress().setVisible(true);
        });
    }
}
