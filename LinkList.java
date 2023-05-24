import java.util.*;
public class LinkList {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        //step -1 create a new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 newNode next = head
        newNode.next = head; // link

        // step -3 head  = newNode
        head= newNode;

    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
    
        tail.next= newNode;
        tail = newNode;

    }
    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail= head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head  = prev;
    }
    public static void main (String args[]){
        LinkList ll = new LinkList();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
       ll.addFirst(4);
        ll.print();
        ll.addFirst(5);
       ll.print();
        ll.addLast(6);
        ll.addLast(7);
        ll.print();
        System.out.println("Reverse LinkedList : ");
        ll.reverse();
        ll.print();

    }
    
}
