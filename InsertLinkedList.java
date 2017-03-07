import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Node {
    int data;
    Node next;
    Node(int val,Node link){
        this.data=val;
        this.next=link;
    }
}

public class InsertLinkedList{
    public static void main(String args[])throws IOException{
        Node head = new Node(1,new Node(2,new Node(3,new Node(4,new Node(5,null)))));
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        insertAtBeginning(head,x);
    }

    public static void insertAtBeginning(Node head , int y){
        
        if(head==null){
            head=new Node(y,null);
        }else{
            Node tempNode = new Node(y,null);
            tempNode.next=head;
            head=tempNode;
        }
        Node current = head;
        while(current!=null){
            System.out.println(current.data+"\n");
            current=current.next;
        }
    }
}