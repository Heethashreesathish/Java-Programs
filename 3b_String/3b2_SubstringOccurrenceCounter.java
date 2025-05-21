/*Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/
import java.util.Scanner;

public class SubstringOccurrenceCounter {

    // User-defined function to count substring occurrences
    public static int countOccurrences(String mainString, String subString) {
        if (mainString == null || subString == null || subString.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length(); // Move past this occurrence
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String mainStr = scanner.nextLine();

        System.out.println("Enter the substring to search:");
        String subStr = scanner.nextLine();

        int occurrences = countOccurrences(mainStr, subStr);

        System.out.println("The substring '" + subStr + "' appears " + occurrences + " time(s) in the main string.");

        scanner.close();
    }
}
