// Question 8: Nested Try-Catch

import java.util.Scanner;

public class Ques8 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter dividend : ");
    String dividendInput = scan.next();
    System.out.println("Enter divisor : ");
    String divisorInput = scan.next();
    try {
      int dividend = Integer.parseInt(dividendInput);
      int divisor = Integer.parseInt(divisorInput);
      try {
        int quotient = dividend/divisor;
        System.out.printf("Division of %d with %d gives %d", dividend, divisor, quotient);
      } catch (ArithmeticException ae) {
        System.out.println("Divisor must not be 0");
        ae.printStackTrace();
      }
    } catch (NumberFormatException nfe) {
      System.out.println("Dividend and divisor both must be integers.");
      nfe.printStackTrace();
    } finally {
      scan.close();
    }
  }
}
