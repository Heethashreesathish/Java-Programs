/*Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display them on console whenever the countries are selected on the list*/
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListSelection extends JFrame {

    public CountryListSelection() {
        setTitle("Country List Selection");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Countries array
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create JList with countries
        JList<String> countryList = new JList<>(countries);

        // Allow multiple selection
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add ListSelectionListener to respond to selection changes
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) { // to avoid double events
                    java.util.List<String> selectedCountries = countryList.getSelectedValuesList();
                    System.out.println("Selected countries: " + selectedCountries);
                }
            }
        });

        // Put the list inside a scroll pane
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Add scroll pane to frame
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CountryListSelection().setVisible(true);
        });
    }
}
