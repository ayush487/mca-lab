// Create a method that accepts an array of integers and returns the maximum and minimum values found in the array

public class Ques2 {
    public static void main(String[] args) {
        int arr[] = {93, 28, 28, 39, 03, 72, 63};
        maxAndMin(arr);
    }

    public static void maxAndMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if (arr.length == 0) {
            System.out.println("Array is Empty");
            return;
        }
        for (int ele : arr) {
            if (ele>max) max=ele;
            if (ele<min) min=ele;
        }
        System.out.printf("Maximum is %d and Minimum is %d", max, min);
    }
}
