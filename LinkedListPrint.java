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

    public void addFirst(int data){
        Node newNode = new Node(data);
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
            System.out.print(temp.next + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        LinkedListPrint ll = new LinkedListPrint();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(4);
        ll.print();
        ll.addFirst(5);
        ll.print();
        ll.addFirst(6);
        ll.print();
        ll.addFirst(7);
        ll.print();

    }
    
}
