// 2. Checking for a Prime Number:

public class PrimeNumberChecker {
  public static void main(String[] args) {
    int num = 29; // this is the number to test
    boolean isPrime = true;

    int numberOfFactors = 0;

    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        // increment when num is a multiple of i
        numberOfFactors++;
      }
    }

    // conditionals to check if num is prime or not
    // if (num <= 1) {
    // isPrime = false;
    // } else if (numberOfFactors != 2) {
    // isPrime = false;
    // } else {
    // isPrime = true;
    // }

    // simpler version
    isPrime = (num > 1 && numberOfFactors == 2);

    if (isPrime) {
      System.out.println(num + " is a prime number.");
    } else {
      System.out.println(num + " is not a prime number.");
    }
  }
}
