package Binary_tree;
public class basic {
    public static  class Node{
        int val;
        Node left;
        Node right;

         Node(int val) {
            this.val=val;
        }
        
    }

    // height of the tree
    public static  int height(Node root){
        if(root==null ||(root.left==null &&root.right==null)) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    // min element of the binary tree
    public static int min_element(Node root){
        if(root==null) return -1;
        return Math.min(root.val,Math.min(min_element(root.left),min_element(root.right)));
    }
    // max element in binary tree
    public static int max_element(Node root){
        if(root==null) return -1;
        return  Math.max(root.val,Math.max(max_element(root.left),max_element(root.right)));
    }
    // all element sum;
    public static int sum(Node root){
        if(root==null) return 0;
        return  root.val+sum(root.left)+sum(root.right);
    }
    // using recursion
    public static int sizerec(Node root){
        if(root==null) return 0;
        return 1+sizerec(root.left)+sizerec(root.right);
    }
    // static counter maintain krka size find krna
    static int size=0;
     public static void static_size(Node root){
        if(root==null) return ;
        size++;
        static_size(root.left);
        static_size(root.right);
        
    }



    //print all the element of the binary tree...in preorder
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val +" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val +"->");
        if(root.left!=null) System.out.print(root.left.val +",");
        if(root.right!=null) System.out.print(root.right.val +",");

        System.out.println();

        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);

        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(10);
        a.left=c;
        a.right=d;

        b.right=e;

        // display(root);
        // preorder(root);
        // static_size(root);
        // System.out.println(size);

        // System.out.println(sizerec(root));
        // System.out.println(sum(root));

        // System.out.println(max_element(root));
        System.out.print(min_element(root));
    }

}
