import java.util.*;

public class fibonaaci {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of times you want to print the series");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }

    }
}
