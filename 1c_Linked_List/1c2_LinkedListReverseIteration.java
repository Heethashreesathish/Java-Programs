/*Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListReverseIteration {
    public static void main(String[] args) {
        // Create a LinkedList to store color names
        LinkedList<String> colors = new LinkedList<>();

        // Add colors to the LinkedList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        // Display the original list
        System.out.println("Original LinkedList: " + colors);

        // Create a descending iterator to iterate in reverse order
        Iterator<String> reverseIterator = colors.descendingIterator();

        // Print elements in reverse order
        System.out.println("Iterating in reverse order:");
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
