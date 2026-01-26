package Recursion.RecursionArrays;

public class binarySearchRecursion {
    public int helper(int[] arr, int target, int lo, int high) {
        if (lo > high)
            return -1;
        int mid = lo + (high - lo) / 2;
        if (arr[mid] == target)
            return mid;
        if (arr[mid] > target)
            return helper(arr, target, lo, mid - 1);
        else
            return helper(arr, target, mid + 1, high);
    }

    public int search(int[] arr, int target) {
        int n = arr.length;
        return helper(arr, target, 0, n - 1);
    }
}
