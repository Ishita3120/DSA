package Recursion;

import java.util.Scanner;

public class binarySearchfirst {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int[] arr = { 2, 3, 5, 7, 8, 8, 9, 10, 11 };
        System.out.println("enter element  you want to search");
        int n = in.nextInt();
        System.out.println(BSfirst(arr, n, 0, 8));

    }

    public static int BSfirst(int[] arr, int target, int lo, int high) {
        if (lo > high)
            return -1;
        int mid = lo + (high - lo) / 2;
        if (arr[mid] > target)
            return BSfirst(arr, target, lo, mid - 1);
        else if (arr[mid] < target)
            return BSfirst(arr, target, mid + 1, high);
        else {
            int leftResult = BSfirst(arr, target, lo, mid - 1);
            if (leftResult != -1) {
                return leftResult;
            } else {
                return mid;

            }
        }
    }
}
