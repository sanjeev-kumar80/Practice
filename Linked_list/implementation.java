package Linked_list;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public  static class linklist{
        Node head= null;
        Node tail=null;

   void delete_Node(int idx) {

    // invalid index
    if (idx < 0 || idx >= size()) {
        System.out.println("wrong idx");
        return;
    }

    // delete head
    if (idx == 0) {
        head = head.next;
        // upper method sa memory waste ho rhi ha
        // Node temp=head;
        // head=head.next;
        // temp.next=null;
        
        if (size() == 0) {
            tail = null;
        }
        return;
    }

    // reach node before idx
    Node temp = head;
    for (int i = 0; i < idx - 1; i++) {
        temp = temp.next;
    }

    // delete node
    temp.next = temp.next.next;

    // update tail if last node deleted
    if (idx == size() - 1) {
        tail = temp;
    }

}


        // get element 

        int getElement(int idx){
            Node temp=head;

            if(idx<0 || idx>size()){
                System.out.println("wrong idx");
                return -1;
            }
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        //insert at any index
        void insrtAtIndex(int idx,int val){
            Node t=new Node(val);

            Node temp=head;
            if(idx==size()){
                insertAtEnd(val);
                return;
                //if you do not apply this that time mainly tail picha hi chutt jata ha

            }
            if(idx<0 || idx>size()){
                System.out.println("wrong idx");
                return;
            }
            if(idx==0){
                insertAtBeginning(val);
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }

        //insert at the beiging

        void insertAtBeginning(int val){
            Node temp=new Node(val);

            //to check linked list is empty is or no 
            if(head==null){
                head=tail=temp;
            }else{//non empty linked list
                temp.next=head;
                head=temp;
            }

        }

        //insert at the end node
        void insertAtEnd(int val){
            Node temp=new Node(val);

            if(head==null){
                head=temp;
            }else{
                tail.next=temp;
                // tail=temp;
            }
            tail=temp;
        }
        
        void display(){
            Node temp=head;
            while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;}

        }

        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }



    }
    public static void main(String[] args) {
        linklist ll =new linklist();

        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        ll.insertAtEnd(11);
        ll.display();
        // System.out.println(ll.size());

        ll.insertAtEnd(15);
        ll.insertAtEnd(19);
        ll.display();
        ll.delete_Node(4);
        ll.display();

        // System.out.println(ll.size());
        // System.out.println(ll.getElement(2));

    }
    
}
