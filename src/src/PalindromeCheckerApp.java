public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "level";   // input string
        String reverse = "";

        // Reverse string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        // Compare original and reversed string
        if (original.equals(reverse)) {
            System.out.println("The string \"" + original + "\" is a Palindrome");
        } else {
            System.out.println("The string \"" + original + "\" is not a Palindrome");
        }
    }
}