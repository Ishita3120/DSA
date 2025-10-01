import java.util.*;

public class countdigits {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int c = 0;
    System.out.println("Enter the number for which you want to check");
    int n = sc.nextInt();
    while (n > 0) {
      int r = n % 10;
      c++;
      n = n / 10;

    }
    System.out.println("The digits in number is" + " " + c);

  }

}
