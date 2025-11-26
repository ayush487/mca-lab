// Question 4 : Finally Block Demonstration

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ques4 {
    public static void main(String[] args) {
        FileInputStream fInputStream = null;
        try {
            fInputStream = new FileInputStream("Prime.java");
            byte[] byteArray = fInputStream.readAllBytes();
            for (byte b : byteArray) {
                System.out.print((char)b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
