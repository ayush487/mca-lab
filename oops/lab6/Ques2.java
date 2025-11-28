import java.util.Scanner;
 
// Question 2 : Custom Exception Class

public class Ques2 {
    public static int getAge(Scanner scan) throws InvalidAgeException {
        int age = scan.nextInt();
        if (age>0 && age <= 150) return age;
        else throw new InvalidAgeException("Age can only between 0 and 150");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter Your Age : ");
            int age = getAge(scan);
            System.out.println("Age is " + age);
        } catch (InvalidAgeException e) {
            System.err.print(e.getMessage());
        } finally {
            scan.close();
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}