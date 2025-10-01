import java.util.*;

public class createstack {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);

    }
}
