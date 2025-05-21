/*Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/
import java.util.Scanner;

public class import java.util.Scanner;

public class RemoveWhitespace {

    // User-defined function to remove all whitespace characters
    public static String removeWhitespace(String input) {
        if (input == null) {
            return null;
        }

        return input.replaceAll("\\s+", ""); // Removes all whitespace characters
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string with whitespace:");
        String input = scanner.nextLine();

        String result = removeWhitespace(input);

        System.out.println("String after removing whitespace: " + result);

        scanner.close();
    }
}


    
       
