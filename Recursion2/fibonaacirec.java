package Recursion;

import java.util.Scanner;

public class fibonaacirec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        } else {
            return fibonacci(x - 1) + fibonacci(x - 2);
        }
    }
}