
import java.util.InputMismatchException;
import java.util.Scanner;

// Question 1 : Basic Exception Handling

public class Ques1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1,num2;
        try {
            System.out.println("Enter dividend : ");
            num1 = scan.nextInt();
            System.out.println("Enter divisor : ");
            num2 = scan.nextInt();
            int solution = num1 / num2;
            System.out.println(solution);
        } catch (InputMismatchException e) {
            System.err.println("Invalid Input Provided");
        } catch (ArithmeticException exception) {
            System.err.println(exception.getMessage());
        } finally {
            scan.close();
        }
    }
}