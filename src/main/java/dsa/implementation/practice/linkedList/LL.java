package dsa.implementation.practice.linkedList;

class Node{
    int data;
    Node next; // linkedlist is the example of self reflection structure
    Node(int x){
        this.data = x;
        this.next = null;
    }
}
public class LL {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next=temp2;
//        printLL(head);
        Node temp =head;
        printLLRecursively(temp);
    }
    static void printLL(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
    static void printLLRecursively(Node temp){
      if(temp==null){
          return;
      }
        System.out.println(temp.data+" ");
      printLLRecursively(temp.next);
    }

}
