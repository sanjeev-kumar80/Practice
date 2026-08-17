package Binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class bfs {

    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }

    }

    public static void Zigzag(Node root) {

    }

    public static void nthlevel(Node root, int n) {
        if (root == null)
            return;
        if (n == 1) {
            System.out.print(root.val + " ");
            return;
        }
        nthlevel(root.left, n - 1);
        nthlevel(root.right, n - 1);
    }

    public static void level_print(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root != null)
            q.add(root);

        while (q.size() > 0) {
            Node temp = q.peek();
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
            System.out.print(temp.val + "  ");
            q.remove();

        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);

        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(10);
        a.left = c;
        a.right = d;

        b.right = e;
        level_print(root);
    }
}
