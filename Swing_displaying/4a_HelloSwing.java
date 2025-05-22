/*Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
Programming in Blue color plain font with font size of 32 using Jframe and Jlabel*/
import javax.swing.*;
import java.awt.*;

public class HelloSwing {

    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Hello Swing");

        // Create the JLabel with the message
        JLabel label = new JLabel("Hello! VI C , Welcome to Swing Programming", SwingConstants.CENTER);

        // Set font to plain, size 32
        label.setFont(new Font("Serif", Font.PLAIN, 32));

        // Set the text color to blue
        label.setForeground(Color.BLUE);

        // Add label to frame's content pane
        frame.getContentPane().add(label);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set frame size
        frame.setSize(700, 150);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make frame visible
        frame.setVisible(true);
    }
}
