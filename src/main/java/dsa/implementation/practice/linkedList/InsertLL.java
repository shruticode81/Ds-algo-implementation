package dsa.implementation.practice.linkedList;

/*class Node{
    int data;
    Node next; // linkedlist is the example of self reflection structure
    Node(int x){
        this.data = x;
        this.next = null;
    }
}*/


public class InsertLL {
    static Node insertAtPos(Node head, int pos, int data){
        Node temp = new Node(data);
        if(pos==1){
            temp.next=head;
            return temp;
        }
        Node curr = head;
        for(int i=1;i<=pos-2 && curr!=null;i++){
            curr=curr.next;
        }
        if(curr==null){
            return head;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
    static Node insertAtEnd(Node head, int x){
        Node temp = new Node(x);
        if(head==null){
            return temp;
        }
        Node curr = head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;

    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next=temp2;
//        insertAtEnd(head, 40);
        insertAtPos(head, 2,50);
        printLLRecursively(head);

    }
    static void printLLRecursively(Node temp){
        if(temp==null){
            return;
        }
        System.out.println(temp.data+" ");
        printLLRecursively(temp.next);
    }
}
