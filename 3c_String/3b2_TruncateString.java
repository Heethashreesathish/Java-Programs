/*Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/
import java.util.Scanner;

public class TruncateString {

    // User-defined function to truncate the string and add ellipsis
    public static String truncate(String input, int maxLength) {
        if (input == null || maxLength <= 0) {
            return "";
        }

        if (input.length() <= maxLength) {
            return input;
        }

        if (maxLength <= 3) {
            // If maxLength is too short, just return dots
            return "...".substring(0, maxLength);
        }

        return input.substring(0, maxLength - 3) + "...";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string to truncate:");
        String input = scanner.nextLine();

        System.out.println("Enter maximum length:");
        int maxLength = scanner.nextInt();

        String result = truncate(input, maxLength);

        System.out.println("Truncated string: " + result);

        scanner.close();
    }
}

