package Binary_tree;

public class leetcode {

  public static class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
      this.val = val;
    }

  }

  public static int height(Node root) {
    if (root == null)
      return 0;
    return 1 + Math.max(height(root.left), height(root.right));
  }

  public static int diameter(Node root) {

    int h1 = 0, h2 = 0;

    if (root.left != null) {
      h1 = height(root.left);
    }

    if (root.right != null) {
      h2 = height(root.right);
    }

    if (root.left == null)
      return 1 + h2;

    if (root.right == null)
      return 1 + h1;

    return 2 + h1 + h2;
  }

  public static void main(String[] args) {

    Node root1 = new Node(1);
    root1.left = new Node(2);
    root1.right = new Node(3);
    root1.left.left = new Node(4);
    root1.left.right = new Node(5);

    System.out.println("Test 1: " + diameter(root1));

  }

}
