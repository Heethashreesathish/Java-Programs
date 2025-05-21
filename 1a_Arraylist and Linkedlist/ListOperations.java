//Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a LinkedList to perform the following operations with different functions directed as
follows1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list
  import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        // Initialize lists
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        System.out.println("=== ARRAYLIST OPERATIONS ===");
        performOperations(arrayList);

        System.out.println("\n=== LINKEDLIST OPERATIONS ===");
        performOperations(linkedList);
    }

    public static void performOperations(List<String> list) {
        // 1. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("1. After adding elements: " + list);

        // 2. Adding element at specific index
        list.add(1, "Mango");
        System.out.println("2. After adding Mango at index 1: " + list);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Pineapple", "Grapes");
        list.addAll(moreFruits);
        System.out.println("3. After adding multiple elements: " + list);

        // 4. Accessing elements
        System.out.println("4. Element at index 2: " + list.get(2));

        // 5. Updating elements
        list.set(2, "Strawberry");
        System.out.println("5. After updating index 2 to Strawberry: " + list);

        // 6. Removing elements
        list.remove("Banana");
        System.out.println("6. After removing 'Banana': " + list);

        // 7. Searching elements
        boolean found = list.contains("Orange");
        System.out.println("7. Is 'Orange' in the list? " + found);

        // 8. List size
        System.out.println("8. List size: " + list.size());

        // 9. Iterating over list
        System.out.print("9. Iterating with for-each: ");
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 10. Using Iterator
        System.out.print("10. Iterating with Iterator: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(list);
        System.out.println("11. After sorting: " + list);

        // 12. Sublist
        List<String> subList = list.subList(1, 3);
        System.out.println("12. Sublist from index 1 to 2: " + subList);

        // 13. Clearing the list
        list.clear();
        System.out.println("13. After clearing: " + list);
    }
}
