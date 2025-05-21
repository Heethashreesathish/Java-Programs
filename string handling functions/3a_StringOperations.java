/*Develop a java program for performing various string operations with different string
handling functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
startsWith() and endsWith()*/
import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. String Creation and Basic Operations
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String staticStr = "AIET College";

        System.out.println("\n1. String Creation and Basic Operations:");
        System.out.println("Input String: " + input);
        System.out.println("Static String: " + staticStr);

        // 2. Length and Character Access
        System.out.println("\n2. Length and Character Access:");
        System.out.println("Length of input string: " + input.length());
        if (input.length() > 0)
            System.out.println("First character: " + input.charAt(0));

        // 3. String Comparison
        System.out.println("\n3. String Comparison:");
        System.out.println("Equals 'AIET': " + input.equals("AIET"));
        System.out.println("EqualsIgnoreCase 'aiet': " + input.equalsIgnoreCase("aiet"));
        System.out.println("CompareTo 'AIET': " + input.compareTo("AIET"));

        // 4. String Searching
        System.out.println("\n4. String Searching:");
        System.out.println("Index of 'e': " + input.indexOf('e'));
        System.out.println("Last index of 'e': " + input.lastIndexOf('e'));
        System.out.println("Contains 'AIET': " + input.contains("AIET"));

        // 5. Substring Operations
        System.out.println("\n5. Substring Operations:");
        if (input.length() >= 5) {
            System.out.println("Substring from 2 to 5: " + input.substring(2, 5));
        }
        System.out.println("Substring from index 3: " + input.substring(3));

        // 6. String Modification
        System.out.println("\n6. String Modification:");
        String modified = input.replace("AIET", "College");
        System.out.println("Modified String: " + modified);

        // 7. Whitespace Handling
        System.out.println("\n7. Whitespace Handling:");
        String spaced = "   " + input + "   ";
        System.out.println("Original with spaces: [" + spaced + "]");
        System.out.println("Trimmed: [" + spaced.trim() + "]");

        // 8. String Concatenation
        System.out.println("\n8. String Concatenation:");
        String concat = input + " " + staticStr;
        System.out.println("Concatenated: " + concat);
        System.out.println("Using concat(): " + input.concat(" ").concat(staticStr));

        // 9. String Splitting
        System.out.println("\n9. String Splitting:");
        System.out.println("Enter a CSV string (e.g. apple,banana,cherry):");
        String csv = scanner.nextLine();
        String[] items = csv.split(",");
        for (String item : items) {
            System.out.println("Item: " + item.trim());
        }
