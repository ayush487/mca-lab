// Question 7 : Throw and Throws

import java.util.Scanner;

public class Ques7 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Set a password : ");
    String password = scan.nextLine();
    try {
      validatePassword(password);
      System.out.println("New Password Updated");
    } catch (WeakPasswordException e) {
      System.out.println(e.getMessage());
    } finally {
      scan.close();
    }
  }

  public static void validatePassword(String password) throws WeakPasswordException {
    if(password.length()<8) throw new WeakPasswordException("Password must have a minimum length of 8 characters.");
    System.out.println("Password Validation Successful!");;
  }
}

class WeakPasswordException extends Exception {
  public WeakPasswordException(String message) {
    super(message);
  }
}