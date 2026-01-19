import java.util.Scanner;

public class bsdesc {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the element that you want to search");
        int target = in.nextInt();
        int[] arr = { 1, 3, 5, 6 };
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        boolean found = false;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                System.out.println(mid);
                found = true;
                break;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }
        }
        if (!found) {
            System.out.println("The correct position of the element would be at" + " " + start);
        }
    }
}
