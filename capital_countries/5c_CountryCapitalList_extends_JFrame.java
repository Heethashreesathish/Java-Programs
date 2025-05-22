/*Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list*/
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;
import java.util.List;

public class CountryCapitalList extends JFrame {

    private HashMap<String, String> countryCapitalMap;
 public CountryCapitalList() {
        setTitle("Country and Capital List");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize country-capital mapping
        countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("USA", "Washington, D.C.");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("Vietnam", "Hanoi");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("Denmark", "Copenhagen");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Great Britain", "London");
        countryCapitalMap.put("Japan", "Tokyo");
countryCapitalMap.put("Africa", "Pretoria (executive)");
        countryCapitalMap.put("Greenland", "Nuuk");
        countryCapitalMap.put("Singapore", "Singapore");

        // Create array of countries
        String[] countries = countryCapitalMap.keySet().toArray(new String[0]);

        // Create JList with countries
        JList<String> countryList = new JList<>(countries);

        // Allow multiple selection
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add ListSelectionListener to display capitals when selection changes
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    List<String> selectedCountries = countryList.getSelectedValuesList();
             if (selectedCountries.isEmpty()) {
                        System.out.println("No countries selected");
                    } else {
                        System.out.println("Selected countries and their capitals:");
                        for (String country : selectedCountries) {
                            String capital = countryCapitalMap.get(country);
                            System.out.println(country + " - " + capital);
                        }
                        System.out.println();  // Blank line for readability
                    }
                }
            }
        });

        // Put list in a scroll pane and add to frame
        JScrollPane scrollPane = new JScrollPane(countryList);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CountryCapitalList().setVisible(true);
        });
    }
}
