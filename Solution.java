class Node {
    int data;
    Node next;
    Node(int val,Node link) {
        this.data=val;
        this.next= link;
    }
}

public class Solution {
    public static void main(String args[]) {
        Node head = new Node(1,new Node(2,new Node(3,new Node(4,null))));
        printList(head);
    }

    public static void printList(Node head) {
        Node current = head;
        while(current!=null) {
            System.out.println(current.data);
            current=current.next;
        }
    }
}