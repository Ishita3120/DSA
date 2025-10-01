import java.util.*;

public class frequencyofdigits {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        System.out.println("enter the digit for which you want to find its frequency");
        int d = in.nextInt();
        int c = 0;
        int num = n;

        while (n > 0) {
            int r = n % 10;
            if (r == d) {
                c++;
            }
            n = n / 10;
        }
        System.out.println("The frequency of" + " " + d + " in this number" + " " + num + "  is" + " " + c);

    }

}
