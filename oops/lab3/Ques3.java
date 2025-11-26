// Write a method that checks if there are any duplicate elements in an integer array. Return true if duplicate exist, otherwise return false.

public class Ques3 {
    public static void main(String[] args) {
        int[] arr = {82,81,23, 812, 13, 32, 73, 72, 813};
        boolean hasDuplicates = checkDuplicates(arr);
        if (hasDuplicates) System.out.println("Array has duplicates");
        else System.out.println("Array does not have any duplicates");
    }

    public static boolean checkDuplicates(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr.length;j++) {
                if (arr[i]==arr[j] && i!=j) return true;
            }
        }
        return false;
    }
}
