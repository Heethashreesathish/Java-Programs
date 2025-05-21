/*Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/
import java.util.Scanner;

public class IsNumericCheck {

    // User-defined function to check if a string is numeric
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        // Using regex to check if all characters are digits
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it is numeric:");
        String input = scanner.nextLine();

        if (isNumeric(input)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string contains non-numeric characters.");
        }

        scanner.close();
    }
}
