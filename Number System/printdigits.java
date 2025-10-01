import java.util.*;

public class printdigits {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int c = 0;
        System.out.println("Enter the number");
        int n = in.nextInt();
        int num = n;
        while (n > 0) {
            int r = n % 10;
            c++;
            n = n / 10;

        }
        int div = (int) Math.pow(10, c - 1);
        while (div != 0) {
            int q = num / div;
            System.out.println(q);
            num = num % div;
            div = div / 10;
        }

    }

}
