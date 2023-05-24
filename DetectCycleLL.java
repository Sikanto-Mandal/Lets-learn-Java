public class DetectCycleLL {
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

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true; //cycle exists
            }
        }
        return false; // cycle doesn't exist
    }


    public static void main(String arg[]){
        // head = new Node(1);
        // head.next.next = new Node(3);
        // head.next = new Node(2);
        // head.next.next.next = new Node (4);
        // head.next.next.next = new Node(5);
        // head.next.next.next.next = head.next.next;
        //1->2 ->3 -> 4 -> 5-> 3 

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next= new Node(3);
        // head.next.next.next = temp; 

        head= new Node(1);
        head.next = new Node(2);
        head.next.next =new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;
        

        System.out.println(isCycle());

    }
    
}
