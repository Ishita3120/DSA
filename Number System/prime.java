import java.util.*;

public class prime {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number that you want to check whether it is prime or not");
        int n = in.nextInt();
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println("It is prime");
        } else {
            System.out.println("It is  composite");
        }

    }

}
