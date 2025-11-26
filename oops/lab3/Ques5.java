// Write a method that rotates an array to the right by a given number of steps

public class Ques5 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr);
        rotateRight(arr, 2);
        printArray(arr);
    }

    public static void rotateRight(int[] arr, int steps) {
        int len = arr.length;
        steps = steps % len;
        reverse(arr, 0, len - 1);
        reverse(arr, 0, steps - 1);
        reverse(arr, steps, len - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int a : arr) System.out.print(a + "\t");
        System.out.println();
    }
}
