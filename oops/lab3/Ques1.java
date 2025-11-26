// Write a method that takes an integer array as input and returns a new array with the elements in reverse order.

public class Ques1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        printArray(arr);
        reverseArray(arr);
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int a : arr) System.out.print(a + "\t");
        System.out.println();
    }
    public static void reverseArray(int[] arr) {
        int len = arr.length;
        int temp;
        for (int i=0;i<len/2;i++) {
            temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = temp;
        }
    }

}
