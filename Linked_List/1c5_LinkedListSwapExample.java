/*Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))*/
import java.util.LinkedList;
import java.util.Collections;

public class LinkedListSwapExample {
    public static void main(String[] args) {
        // Create a LinkedList to store color names
        LinkedList<String> colorList = new LinkedList<>();

        // Add some colors
        colorList.add("Red");     // Index 0
        colorList.add("Green");   // Index 1
        colorList.add("Blue");    // Index 2
        colorList.add("Yellow");
        colorList.add("Black");

        // Display the original list
        System.out.println("Original LinkedList: " + colorList);

        // Swap the first and third elements (index 0 and 2)
        if (colorList.size() > 2) {
            Collections.swap(colorList, 0, 2);
            System.out.println("LinkedList after swapping 1st and 3rd elements: " + colorList);
        } else {
            System.out.println("Not enough elements to perform swap.");
        }
    }
}
