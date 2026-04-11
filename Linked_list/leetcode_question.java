package Linked_list;

import java.util.Scanner;

public class leetcode_question {

    public static  class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    //question-7 (21. Merge Two Sorted Lists)
    public  static Node mergeTwoLists(Node list1, Node list2) {
        Node temp1=list1;
        Node temp2=list2;
        Node head=new Node(1);
        Node temp=head;
        while(temp1!=null && temp2 !=null){
            if(temp1.data<temp2.data){
                temp.next=temp1;
                temp=temp1;
                temp1=temp1.next;
            }else{
                temp.next=temp2;
                temp=temp2;
                temp2=temp2.next;
            }
        }
        if(temp1==null) temp.next=temp2;
        else temp.next=temp1;

        return head.next;
        
    }

    //question--6(142. Linked List Cycle II)
    public static  Node detectCycle(Node head) {
        Node slow =head;
        Node fast=head;
        Node temp=head;
        
        while(fast!=null){
           
            slow=slow.next;
            if(fast.next==null) return null;
            fast=fast.next.next;

            if(slow==fast){
            while(temp!=slow){
                slow=slow.next;
                temp=temp.next;

            }
            return slow;
            }
        }
        return null;
    }
    //question--5 (141. Linked List Cycle)
     public static boolean hasCycle(Node head) {
        Node slow =head;
        Node fast=head;
        if(head==null) return false;
        if(head.next==null) return false;
        while(fast!=null){
            if(slow==null) return false;
            slow=slow.next;
            if(fast.next==null) return false;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
        
    }
    //question--4 delete the middle element of the linklist
    // question--3(876. Middle of the Linked List)--left middle if even length
    public static  Node middleNode2(Node head) {
        Node slow=head;
        Node fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    // question--3(876. Middle of the Linked List)--right middle if even
    public static  Node middleNode(Node head) {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    //question--2(160- Intersection of Two Linked Lists)
     public Node getIntersectionNode(Node headA, Node headB) {
        Node tempA=headA;
        Node tempB=headB;
        int lenA=0;

        while(tempA!=null){
            lenA++;
            tempA=tempA.next;
        }
        int lenB=0;
        while(tempB!=null){
            lenB++;
            tempB=tempB.next;
        }
        tempA=headA;
        tempB=headB;

        if(lenA>lenB){
            int steps=lenA-lenB;
            for(int i=1;i<=steps;i++){
                tempA=tempA.next;
            }
        }else{
            int steps=lenB-lenA;
            for(int i=1;i<=steps;i++){
                tempB=tempB.next;
            }
        }
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
        
    }
    //question--1 IInd method
    public static int nth_node_fron_end2(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;
    }
    //question--1

    public static int nth_node_fron_end(Node head,int n){
        Node temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        System.out.println(len);
        temp=head;
        for(int i=1;i<len-n+1;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    public static void display(Node head){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
    public static int length(Node head){
        Node temp=head;
        int count =0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static int getElement(Node head,int idx){
        Node temp=head;
        int count=0;
        while(count<idx){
            count++;
            temp=temp.next;
        }
        return temp.data;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        // e.next=f;
        // System.out.println(a);

        System.out.println("enter the no of the last node");

        int n=sc.nextInt();

        // int m=length(a);
        // int idx=m-n;

        // if (n <= 0 || n > m) {
        // System.out.println("Invalid n value");
    
        //     }else{
        //         System.out.println(getElement(a,idx));
        //     }


        display(a);
        // System.out.println();
        // System.out.println(nth_node_fron_end2(a, n));
        System.out.println(middleNode2(a).data);
    }
    
}
