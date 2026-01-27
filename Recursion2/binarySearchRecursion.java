package Recursion;

import java.util.*;

public class binarySearchRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = { 2, 3, 5, 7, 8, 9, 9, 10, 11 };
        System.out.println("enter the element you want to search");
        int n = in.nextInt();
        System.out.println(helper(arr, n, 0, 8));
    }

    public static int helper(int[] arr, int target, int lo, int high) {
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

}
