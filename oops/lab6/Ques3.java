
// Question 3 : Multiple Catch Blocks

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        int[] arr = new int[]{5,10,15,20,25};
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a index from 0 to 4");
            int indexInput = scanner.nextInt();
            int ele = arr[indexInput];
            System.out.println(ele);
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
