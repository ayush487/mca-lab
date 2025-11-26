import java.util.Scanner;

public class Prime {
    
    public static boolean isPrime(int a, int b) {
        if (b>a/2) return true;
        if (a%b==0) return false;
        else return isPrime(a, b+1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        System.out.print(isPrime(p, 2));
        scan.close();
    }
}
