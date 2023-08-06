public class PalindromeChecker {
  public static void main(String[] args) {
    String original = "racecar";
    String reversed = "";

    // for loop to get the letter of original word starting from the last and add to
    // the reversed word
    for (int i = original.length() - 1; i >= 0; i--) {
      reversed += original.charAt(i);
    }

    boolean isPalindrome = true;

    // for loop to check if the letters of the original word is not the same with
    // the letters of the reversed word
    for (int i = 0; i < original.length(); i++) {
      if (original.charAt(i) != reversed.charAt(i)) {
        isPalindrome = false;
      }
    }

    // prints whether the original word is a palindrome or not
    if (isPalindrome) {
      System.out.println("The word " + '"' + original.toUpperCase() + '"' + " is a palindrome!");
    } else {
      System.out.println("The word " + '"' + original.toUpperCase() + '"' + " is not a palindrome!");
    }
  }
}
