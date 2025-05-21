/*Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan*/
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ColorTabbedPaneCMY extends JFrame {

    private JPanel cyanPanel, magentaPanel, yellowPanel;

    public ColorTabbedPaneCMY() {
        setTitle("CMY Color Tabbed Pane");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create panels with CMY colors
        cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Create tabbed pane and add tabs
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Optional: print which tab is selected
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int selectedIndex = tabbedPane.getSelectedIndex();
                String title = tabbedPane.getTitleAt(selectedIndex);
                System.out.println(title + " tab selected");
            }
        });

        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ColorTabbedPaneCMY().setVisible(true);
        });
    }
}
