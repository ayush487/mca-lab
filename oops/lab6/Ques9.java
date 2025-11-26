// Question 9: Exception Chaining

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ques9 {
  public static void main(String[] args) {
    System.out.println("Enter file name you want to read : ");
    Scanner scan = new Scanner(System.in);
    String fileName = scan.nextLine();
    try {
      System.out.println("Reading data from " + fileName);
      byte[] data = getDataFromFile(fileName);
      System.out.println("Reading Complete\nDisplaying output now : ");
      for (byte b : data) System.out.print((char) b);
    } catch (DataProcessingException e) {
      System.out.println("Exception occured!\nCaused by " + e.getCause());
      scan.close();
    }
    scan.close();
  }
  public static byte[] getDataFromFile(String file) throws DataProcessingException {
    try (FileInputStream fis = new FileInputStream(file)) {
      return fis.readAllBytes();
    } catch (IOException e) {
     throw new DataProcessingException(e);
    }
  }
}

class DataProcessingException extends Exception {
  public DataProcessingException(Exception cause) {
    super(cause);
  }
}
