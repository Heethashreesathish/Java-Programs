/*Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith()*/
public class StringOperationsDemo {

    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        String str3 = new String("Hello World");

        System.out.println("1. String Creation and Basic Operations:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println();

        // 2. Length and Character Access
        System.out.println("2. Length and Character Access:");
        System.out.println("Length of str3: " + str3.length());
        System.out.println("Character at index 6: " + str3.charAt(6));
        System.out.println();

        // 3. String Comparison
        System.out.println("3. String Comparison:");
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase("hello"));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));
        System.out.println();

        // 4. String Searching
        System.out.println("4. String Searching:");
        System.out.println("Index of 'World' in str3: " + str3.indexOf("World"));
        System.out.println("str3 contains 'Hello': " + str3.contains("Hello"));
        System.out.println();

        // 5. Substring Operations
        System.out.println("5. Substring Operations:");
        System.out.println("Substring from index 6: " + str3.substring(6));
        System.out.println("Substring from 0 to 5: " + str3.substring(0, 5));
        System.out.println();

        // 6. String Modification
        System.out.println("6. String Modification:");
        String modified = str3.replace("World", "Java");
        System.out.println("Modified string: " + modified);
        System.out.println();

        // 7. Whitespace Handling
        System.out.println("7. Whitespace Handling:");
        String strWithSpaces = "   Hello Java   ";
        System.out.println("Original with spaces: [" + strWithSpaces + "]");
        System.out.println("Trimmed: [" + strWithSpaces.trim() + "]");
        System.out.println();

        // 8. String Concatenation
        System.out.println("8. String Concatenation:");
        String concat1 = str1 + " " + str2;
        String concat2 = str1.concat(" ").concat(str2);
        System.out.println("Using +: " + concat1);
        System.out.println("Using concat(): " + concat2);
        System.out.println();

        // 9. String Splitting
        System.out.println("9. String Splitting:");
        String csv = "apple,banana,cherry";
        String[] fruits = csv.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println();

        // 10. StringBuilder Demo
        System.out.println("10. StringBuilder Demo:");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(6, 11, " Java");
        System.out.println("StringBuilder result: " + sb.toString());
        System.out.println();

        // 11. String Formatting
        System.out.println("11. String Formatting:");
        String name = "Alice";
        int age = 25;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println(formatted);
        System.out.println();

        // 12. Validate Email
        System.out.println("12. Email Validation:");
        String email = "test@example.com";
        boolean isValid = email.contains("@") &&
                          email.startsWith("test") &&
                          email.endsWith(".com");
        System.out.println("Email: " + email);
        System.out.println

