package Recursion;

import java.util.Scanner;

public class aRaisedtoPowerb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(power(x, y));
    }

    public static int power(int a, int b) {
        if (b == 0)
            return 1;
        if (b == 1)
            return a;
        else
            return a * power(a, b - 1);
    }
}
