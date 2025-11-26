// Question 6 : Try with resources

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ques6 {
  public static void main(String[] args) {
    byte[] fileData = {};
    try (FileInputStream inputStream = new FileInputStream("Ques1.java")) {
      fileData = inputStream.readAllBytes();
    } catch (IOException e) {
      e.printStackTrace();
    }
    try (FileOutputStream outputStream = new FileOutputStream("Ques1.java Duplicate")) {
      outputStream.write(fileData);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Data copied succesfully");
  }
}
