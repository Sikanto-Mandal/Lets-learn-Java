public class Queues {
    static class QueueB{
        static int arr[];
        static int size;
        static int rear;

        QueueB(int n){
            arr= new int [n];
            size = n;
            rear  = -1; 
        }

        public static boolean isEmpty(){
            return rear == -1; 
        }


        //addd
        public static void add (int data){
            if(rear == size -1){
                System.out.println("queue is full");
                return;
            }
            rear = rear+1;
            arr[rear]= data;

        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int front = arr[0];
            for(int i =0; i<rear; i++){
                 arr[i]= arr[i+1];
            }
            rear = rear-1;
            return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return arr[0];
        }
    }   

    public static void main(String args[]){
        QueueB q = new QueueB(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
         

    }
    
}
