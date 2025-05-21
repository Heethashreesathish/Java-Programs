/*Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/
import java.util.ArrayList;
import java.util.List;

public class ColorSubList {
    public static void main(String[] args) {
        // Create an ArrayList to store color names
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original list of colors: " + colors);

        // Extract 1st and 2nd elements using subList (index 0 to 2)
        if (colors.size() >= 2) {
            List<String> subList = colors.subList(0, 2); // from index 0 (inclusive) to 2 (exclusive
