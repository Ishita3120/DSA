package Recursion;

import java.util.Scanner;

public class factorialrec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number you want to find factorial");
        int n = in.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

}
