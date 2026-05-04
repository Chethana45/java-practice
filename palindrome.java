import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word to check: ");
        String original = scanner.nextLine();
        
      
        String cleanString = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        String reversed = "";

        for (int i = cleanString.length() - 1; i >= 0; i--) {
            reversed += cleanString.charAt(i);
        }

        if (cleanString.equals(reversed)) {
            System.out.println("\"" + original + "\" is a palindrome!");
        } else {
            System.out.println("\"" + original + "\" is NOT a palindrome.");
        }
        
        scanner.close();
    }
}
