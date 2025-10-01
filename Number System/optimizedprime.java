import java.util.*;

public class optimizedprime {
    public static void main(String args[]) {
        int c = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                c++;
                break;
            }
            if (c == 0) {
                System.out.println(n);
            }

        }

    }

}
