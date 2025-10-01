import java.util.*;

public class Search {
    public static int Binarysearch(int[] arr, int element) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + (end - start) / 2);
            if (element == arr[mid]) {
                return mid;

            } else if (element < arr[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;

            }
        }

        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search");
        int element = sc.nextInt();
        System.out.println("Enter how many elements you want in the array?");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The sorted array is" + Arrays.toString(arr));
        int res = Binarysearch(arr, element);
        if (res != -1) {
            System.out.println("Element found at index" + " " + res);

        } else {
            System.out.println("Element not found in the array");
        }
    }
}
