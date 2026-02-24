public class traversalinBT {
    static class Node { // Make Node static
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void preorder(Node root) {
        if (root == null)
            return;
        else {
            System.out.print(root.val);
            preorder(root.left);
            preorder(root.right);
        }

    }

    public static void postorder(Node root) {
        if (root == null)
            return;
        else {

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val);
        }

    }

    public static void inorder(Node root) {
        if (root == null)
            return;
        else {
            inorder(root.left);
            System.out.print(root.val);
            inorder(root.right);
        }

    }

    public static void main(String args[]) {

        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(0);
        Node f = new Node(0);
        Node g = new Node(9);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;
        preorder(a);
        postorder(a);
        inorder(a);
    }

}
