package dsa.implementation.practice.linkedList;


class NodeDoubly{
    int data;
    NodeDoubly prev;
    NodeDoubly next;
    NodeDoubly(int x){
        this.data =x;
        prev = null;
        next = null;
    }
}
public class DoublyLL {
    public static void main(String[] args) {
        NodeDoubly head = new NodeDoubly(10);
        NodeDoubly temp1 = new NodeDoubly(20);
        NodeDoubly temp2 = new NodeDoubly(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;

    }
}
