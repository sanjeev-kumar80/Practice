package Linked_list;

public class basic {

    public static int length_of_linklist(Node head){
        int count=0;
        Node temp=head;
        while (temp!=null) { 
            count++;
            temp=temp.next;
        }
        return count;

    }
            public static void recursion_diaplay(Node head){
                if(head==null){//base case
                    return;
                }
                System.out.println(head.data);
                recursion_diaplay(head.next);
            }

    public static void display(Node head){
        Node temp=head;//use this method we can not loos our head 
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    
    public static class Node {
        int  data;//value 
        // Node 
        Node next;//address of the next datav 
        Node(int data){
            this.data=data;
        }
    
        
    }
    public static void main(String[] args) {
        //node ka object
        // Node x=new Node(5);
        // System.out.println(x.data);
        // System.out.println(x.next);

        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(16);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        // System.out.println(a.data);
        // System.out.println(b.data);
        // System.out.println(c.data);
        // System.out.println(d.data);
        // System.out.println(e.data);

        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);



        //when the size of the node is given
        // Node temp=a;
        // for(int i=0;i<5;i++){
        //     System.out.println(temp.data);
        //     temp=temp.next;
        // }


        //when the size of the nde is not given

        // Node temp=a;
        // while(temp!=null){
        //     System.out.println(temp.data);
        //     temp=temp.next;
        // }

        // display(a);

        //using recursion
        // recursion_diaplay(a);

        System.out.println(length_of_linklist(a));
        
    }
    
}
