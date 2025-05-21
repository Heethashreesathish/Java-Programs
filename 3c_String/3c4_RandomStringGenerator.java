/*Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()*/
import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {

    // User-defined function to generate random string of specified length
    public static String generateRandomString(int length) {
        if (length <= 0) {
            return "";
        }

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            sb.append(chars.charAt(index));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the desired length of the random string:");
        int length = scanner.nextInt();

        String randomString = generateRandomString(length);
        System.out.println("Generated random string: " + randomString);

        scanner.close();
    }
}
