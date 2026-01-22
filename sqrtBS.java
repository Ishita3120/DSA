import java.util.*;

public class sqrtBS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the element yo want to find the sqrt of");
        int x = in.nextInt();
        int i = 0, j = x;
        int mid = 0;
        while (i <= j) {
            mid = (i + j) / 2;
            if (mid * mid == x) {
                System.out.println(j);
                ;
                break;

            } else if (mid * mid > x) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        System.out.println(j);

    }
}
