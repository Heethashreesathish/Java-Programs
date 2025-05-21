/*Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/
import java.util.LinkedList;

public class LinkedListOfferLastExample {
    public static void main(String[] args) {
        // Create a LinkedList to store color names
        LinkedList<String> colorList = new LinkedList<>();

        // Add some initial colors
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");

        // Display the original list
        System.out.println("Original LinkedList: " + colorList);

        // Insert "Pink" at the end using offerLast()
        colorList.offerLast("Pink");

        // Display the updated list
        System.out.println("LinkedList after inserting 'Pink' at the end: " + colorList);
    }
}
