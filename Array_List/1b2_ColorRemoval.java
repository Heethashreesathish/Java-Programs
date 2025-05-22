/*Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList*/
import java.util.ArrayList;

public class ColorRemoval {
    public static void main(String[] args) {
        // Create an ArrayList to store color names
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        // Display the original list
        System.out.println("Original list of colors: " + colors);

        // Remove the 2nd element (index 1)
        if (colors.size() > 1) {
            colors.remove(1);
            System.out.println("After removing the 2nd element (index 1): " + colors);
        } else {
            System.out.println("List does not have a 2nd element to remove.");
        }

        // Remove the color "Blue" by value
        boolean removed = colors.remove("Blue");
        if (removed) {
            System.out.println("After removing 'Blue': " + colors);
        } else {
            System.out.println("'Blue' was not found in the list.");
        }
    }
}
