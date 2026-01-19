import java.util.Scanner;

public class firstoccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[20];
        System.out.println("enter elements in the array");
        // array input
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("enter the element you want to search");
        int x = in.nextInt();
        int i = 0;
        int j = a.length - 1;
        int mid;
        int idx = 0;
        while (i <= j) {
            mid = (i + j) / 2;
            if (a[mid] > x) {
                j = mid - 1;
            } else if (a[mid] < x) {
                i = mid + 1;
            }
            // element already mil chuka hai you are checking ki vo first occurence hai ya
            // nhi
            else {
                idx = mid;
                j = mid - 1;

            }
        }
        System.out.println("the first occurence of the element is at position" + " " + idx);
    }
}
