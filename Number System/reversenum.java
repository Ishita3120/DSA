import java.util.*;

public class reversenum {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        int n = in.nextInt();
        int s = 0;
        while (n > 0) {
            int r = n % 10;
            s = r + s * 10;
            n = n / 10;
        }
        System.out.println("The reversed number is" + " " + s);
    }

}
