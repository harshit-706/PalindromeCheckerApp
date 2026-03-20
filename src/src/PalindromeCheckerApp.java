public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Level";

        String normalized = input.toLowerCase();

        long startTime = System.nanoTime();

        boolean isPalindrome = true;
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        long endTime = System.nanoTime();

        System.out.println("Input : " + input);
        System.out.println("Is Palindrone? : " + isPalindrome);
        System.out.println("Execution Tine : " + (endTime - startTime) + " ns");
    }
}