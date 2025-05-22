/*Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index*/
import java.util.ArrayList;

public class ColorRemoveByIndex {
    public static void main(String[] args) {
        // Create an ArrayList to store color names
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original list of colors: " + colors);

        // Specify the index (n-th element) to remove
        int n = 2; // 0-based index: this removes the 3rd element ("Blue")

        // Remove the n-th element if the index is valid
        if (n >= 0 && n < colors.size()) {
            String removedColor = colors.remove(n);
            System.out.println("Removed element at index " + n + ": " + removedColor);
        } else {
            System.out.println("Invalid index. Cannot remove
