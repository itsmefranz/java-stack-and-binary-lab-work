public class ChristmasTree {
  public static void main(String[] args) {
    int height = 5; // since output has 5 rows
    // number of rows
    for (int i = 1; i <= height; i++) {

      // number of spaces to be printed before the asterisks
      for (int j = 1; j <= (height - i); j++) {
        System.out.print(" ");
      }

      // for printing asterisks - same number of asterisks with the current row number
      for (int k = 1; k <= i; k++) {
        System.out.print("* ");
      }

      // printing new line
      System.out.println();
    }
  }
}