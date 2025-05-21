/*Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and
display the concerned color whenever the specific tab is selected in the Pan*/
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ColorTabbedPane extends JFrame {

    private JPanel redPanel, bluePanel, greenPanel;

    public ColorTabbedPane() {
        setTitle("Color Tabbed Pane");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create panels for each color
        redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        // Create tabbed pane and add tabs
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add ChangeListener to detect tab changes (optional if you want to do something on tab select)
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int selectedIndex = tabbedPane.getSelectedIndex();
                String title = tabbedPane.getTitleAt(selectedIndex);
                System.out.println(title + " tab selected");
                // Panels already show their color as background
            }
        });

        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ColorTabbedPane().setVisible(true);
        });
    }
}
