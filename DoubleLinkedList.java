public class DoubleLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;
        
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //addFirst
    public void addFirst (int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail= newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head= newNode;
    }
    //addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail.prev =newNode;
        tail = newNode;
    }
    //remove First
    public int removeFirst(){
        if(head == null){
            System.out.println("DLL is empty:");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev= null;
        size --;
        return val;

    }
    //remove Last
    public int removeLast(){
        if(head == null){
            System.out.println("DLL is empty:");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node prev = head;
        for(int i = 0; i<size-2; i++){
            prev= prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        tail.prev = null;
        size--;
        return val;

    }
    //print
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public static void main(String args[]){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();

        dll.addLast(5);
        dll.addLast(6);
        dll.print();
        System.out.println("size "+dll.size);
        dll.removeFirst();
        dll.print();
        System.out.println("size "+dll.size);

        dll.removeLast();
        dll.print();
        System.out.println("size "+dll.size);
    }
    
}
