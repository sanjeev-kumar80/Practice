package DoubleLinkedList;

public class basic {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static void display3(Node random){
        //random node is given --->travel to the head then print the whole linked list..
        Node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }

        while(temp!=null){
            System.out.print(temp.val +" ");
            temp=temp.next;
        }
    }

    public static void display2(Node tail){//when tail is given 
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val +" ");
            temp=temp.prev;
        }
    }
    public static void display(Node head){//when  head is given 
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val +" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        //4 10 2 99 13
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
        
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;

        // display(a);
        // display2(e);
        display3(d);
        
    }
    
}
