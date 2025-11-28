import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Factorial {

    public static int[] getFactorial(int n) {
        int current[] = new int[]{1};
        for (int i=2;i<=n;i++) {
            current = multiply(current, i);
        }
        return current;
    }

    public static int[] multiply(int[] number, int totalNumber) {
        int[] currentNum = {0};
        int power = 0;
        while (totalNumber > 0) {
            int n = totalNumber % 10;
            int[] tempNumber = multi(Arrays.copyOf(number, number.length), n);
            tempNumber = multiplyByPower10(tempNumber, power);
            power++;
            totalNumber = totalNumber / 10;
            currentNum = addNumbers(currentNum, tempNumber);
        }
        return currentNum;

    }

    public static int[] multiplyByPower10(int[] number, int n) {
        if (n==0) return number;
        int[] newNumber = new int[number.length+n];
        for (int i=0;i<number.length;i++) {
            newNumber[i+n] = number[i];
        }
        return newNumber;
    }

    public static int[] multi(int[] number, int n) {
        int carry = 0;
        int i;
        for (i = 0; i < number.length; i++) {
            int digit = number[i];
            int multiply = digit * n;
            int multi = multiply % 10;
            int nextCarry = multiply / 10;
            int numberShouldBe = multi + carry;
            if (numberShouldBe >= 10) {
                numberShouldBe = numberShouldBe % 10;
                nextCarry++;
            }
            number[i] = numberShouldBe;
            carry = nextCarry;
        }

        if (carry > 0) {
            int[] newNumber = new int[number.length + 1];
            for (int w = 0; w < number.length; w++)
                newNumber[w] = number[w];
            newNumber[number.length] = carry;
            return newNumber;
        }
        return number;
    }

    public static int[] addNumbers(int[] num1, int[] num2) {
        int l1 = num1.length;
        int l2 = num2.length;
        int l = l1 > l2 ? l1 : l2;
        int temp[];
        if (num1.length<l) {
            temp = num1;
            num1 = new int[l];
            for (int i=0;i<temp.length;i++) {
                num1[i] = temp[i];
            }
        }
        if (num2.length<l) {
            temp = num2;
            num2 = new int[l];
            for (int i=0;i<temp.length;i++) {
                num2[i] = temp[i];
            }
        }
        int output[] = new int[l + 1];
        int carry = 0;
        int i;
        for (i = 0; i < l; i++) {
            int n1 = num1.length >= i ? num1[i] : 0;
            int n2 = num2.length >= i ? num2[i] : 0;
            int sumOfDigit = n1 + n2 + carry;
            if (sumOfDigit > 9) {
                sumOfDigit = sumOfDigit % 10;
                carry = 1;
            } else
                carry = 0;
            output[i] = sumOfDigit;
        }
        if (carry > 0)
            output[i] = carry;
        return output;
    }

    public static void displayNumber(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }

    public static int[] trim(int[] number) {
        int i=0;
        for (;i<number.length;i++) {
            if (number[number.length-1-i]!=0) break;
        }
        int[] formattedNumber = new int[number.length-i];
        for (int j=0;j<number.length-i;j++) {
            formattedNumber[j] = number[j];
        }
        return formattedNumber;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to find factorial : ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.close();
        int[] number = getFactorial(input);
        System.out.println("Factorial of " + input + " is ");
        displayNumber(trim(number));
    }
}