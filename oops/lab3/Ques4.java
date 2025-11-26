// Create a method that merges the two sorted integer arrays into a single sorted array.

public class Ques4 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,4,6,8,10,12,14,16};
        int[] arr2 = new int[]{2,3,5,7,11,13};
        printArray(mergeSortedArrays(arr1, arr2));
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i=0,j=0,k=0;
        while (i<arr1.length && j<arr2.length) {
            if (arr1[i]>arr2[j]) mergedArray[k++] = arr2[j++];
            else mergedArray[k++] = arr1[i++];
        }
        while (i<arr1.length) {
            mergedArray[k++] = arr1[i++];
        }
        while (j<arr2.length) {
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }
    public static void printArray(int[] arr) {
        for (int a : arr) System.out.print(a + "\t");
        System.out.println();
    }
}
