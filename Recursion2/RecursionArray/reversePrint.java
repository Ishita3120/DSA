package Recursion.RecursionArrays;

public class reversePrint {
    public static void main(String args[]) {
        int[] arr = { 5, 3, 712, 76, 9, 34, 5 };
        revrecPrint(arr, 0);
    }

    public static void revrecPrint(int[] arr, int idx) {
        if (idx == arr.length)
            return;
        revrecPrint(arr, idx + 1);
        System.out.println(arr[idx]);
    }

}
