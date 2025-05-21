/*Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterationFromSecond {
    public static void main(String[] args) {
        // Create a LinkedList to store color names
        LinkedList<String> colors = new LinkedList<>();

        // Add some colors to the LinkedList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Full LinkedList: " + colors);

        // Create a ListIterator starting at index 1 (2nd element)
        ListIterator<String> iterator = colors.listIterator(1);

        System.out.println("Iterating from the 2nd element (index 1):");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
