// package BinaryTree;

// import javax.swing.*;

public class ImplementationOfBinaryTree {

    static class Node { // Make Node static
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void traverse(Node root) {
        if (root == null)
            return;
        System.out.println(root.val);
        traverse(root.left);
        traverse(root.right);
    }

    public static int size(Node root) {
        if (root == null)
            return 0;
        else
            return 1 + size(root.left) + size(root.right);
    }

    public static int product(Node root) {
        if (root == null)
            return 1;
        else
            return (root.val * product(root.left) * product(root.right));
    }

    public static int sum(Node root) {
        if (root == null)
            return 0;
        else
            return (root.val + sum(root.left) + sum(root.right));
    }

    public static int nonZeroProduct(Node root) {
        if (root == null)
            return 1;
        else {
            int leftNoneZero = nonZeroProduct(root.left);
            int rightNoneZero = nonZeroProduct(root.right);
            if (root.val == 0) {
                return leftNoneZero * rightNoneZero;
            } else {
                return root.val * leftNoneZero * rightNoneZero;
            }
        }

    }

    public static int levelsBinaryTree(Node root) {
        if (root == null)
            return 0;
        else
            return 1 + Math.max(levelsBinaryTree(root.left), levelsBinaryTree(root.right));
    }

    public static int max(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;
        else
            return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    public static int min(Node root) {
        if (root == null)
            return Integer.MAX_VALUE;
        else
            return Math.min(root.val, Math.min(min(root.left), min(root.right)));
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
        traverse(a);
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(nonZeroProduct(a));
        System.out.println(levelsBinaryTree(a));
        System.out.println(max(a));
        System.out.println(min(a));
    }
}