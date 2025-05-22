/*Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p))*/
import java.util.LinkedList;

public class LinkedListElementPositions {
    public static void main(String[] args) {
        // Create a LinkedList to store color names
        LinkedList<String> colorList = new LinkedList<>();

        // Add some colors
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Black");

        // Display elements and their positions using get(index)
        System.out.println("Elements and their positions in the LinkedList:");
        for (int i = 0; i < colorList.size(); i++) {
            System.out.println("Index " + i + ": " + colorList.get(i));
        }
    }
}
