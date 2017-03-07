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

public class DeleteFromList{
    public static void main(String args[])throws IOException{
        Node head = new Node(1,new Node(2,new Node(3,new Node(4,new Node(5,null)))));
        System.out.println("Enter the number to be deleted: ");
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        deletefromList(head,x);
    }

    public static void deletefromList(Node head , int y){
        Node temp = null;
        Node current = head;
        if(head.data==y){
            head=null;
           return;
        }
        while(current.next!=null){
            if(current.next.data == y){
                temp=current;
            }
            current=current.next;
        }
        if(temp==null){
            System.out.println("Does not exist");
        }
        Node curr = head;
        while(curr!=null){
            if(curr.data==y){
                temp.next=curr.next;
            }
            curr=curr.next;
        }
        Node iterator = head;
        while(iterator!=null){
            System.out.println(iterator.data+"\n");
            iterator=iterator.next;
        }
    }
}