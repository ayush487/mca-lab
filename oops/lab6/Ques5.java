// Question 5 : Exception Propagation

public class Ques5 {
    // solves whole equation -> a * (b * c) / (d / e)
    public static int methodA(int a, int b, int c, int d, int e) {
        try {
            int second = methodB(b,c,d,e);
            return a * second;
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
            // System.out.println("Exception occurs msg : " + exception.getMessage());
        }
        return -1;
    }

    // solves (b*c) / (d/e)
    public static int methodB(int b, int c, int d, int e) throws ArithmeticException {
        int first = b*c;
        int second = methodC(d, e);
        return methodC(first, second);
    }

    // do division
    public static int methodC(int a, int b) throws ArithmeticException {
        if (b == 0)
            throw new ArithmeticException();
        return a / b;
    }

    public static void main(String[] args) {
        // Solve : a * (b * c) / (d / e)
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 50;
        int e = 10;
        int solution = methodA(a, b, c, d, e);
        System.out.println(solution);
    }
}
