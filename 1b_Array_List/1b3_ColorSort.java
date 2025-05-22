/*Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)*/
import java.util.ArrayList;
import java.util.Collections;

public class ColorSort {
    public static void main(String[] args) {
        // Create an ArrayList to store color names
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the ArrayList
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original list of colors: " + colors);

        // Sort the colors using Collections.sort()
        Collections.sort(colors);

        // Display sorted list
        System.out.println("Sorted list of colors: " + colors);
    }
}

