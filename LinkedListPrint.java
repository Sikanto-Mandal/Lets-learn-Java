import java.net.SocketTimeoutException;

public class LinkedListPrint {
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
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size ++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addLast(int data){
    Node newNode = new Node(data);
        size ++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail=newNode;
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    //find midNode
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
    //find half reverse
    public boolean palindrome(){
        if(head == null || head.next == null){
            return true;
        }
        Node midNode = findMid(head);
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        while (right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size --;
        return val;
    }
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1){
            int val = head.data;
            head = tail = null;
            return  val;
        }
        Node prev = head; 
        for(int i =0; i<size -2; i++){
            prev = prev.next;
        }
        int val = tail.data;
        tail.next = null;
        tail = prev;
        size--;
        return val;
    }
    
    
    public static void main(String args[]){
        LinkedListPrint ll = new LinkedListPrint();
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        ll.addFirst(5);
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        ll.addLast(4);
        ll.addLast(5);
        ll.addFirst(0);
        ll.print();
        // System.out.println("Reverse Linked List : ");
        // ll.reverse();

        System.out.println("palindrome  " + ll.palindrome());
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println("size of LINKEDLIST = " + size);
        

    }
    
}
