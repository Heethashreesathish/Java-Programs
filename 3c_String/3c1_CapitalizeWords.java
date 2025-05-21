/*Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()*/
import java.util.Scanner;

public class CapitalizeWords {

    // User-defined function to capitalize the first letter of each word
    public static String capitalizeWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] words = input.trim().split("\\s+"); // Split on one or more spaces
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                capitalized.append(Character.toUpperCase(word.charAt(0))); // Capitalize first letter
                if (word.length() > 1) {
                    capitalized.append(word.substring(1).toLowerCase()); // Append the rest in lowercase
                }
                capitalized.append(" ");
            }
        }

        return capitalized.toString().trim(); // Remove trailing space
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        String result = capitalizeWords(input);

        System.out.println("Capitalized: " + result);

        scanner.close();
    }
}
