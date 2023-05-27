import java.util.*;
public class NextGreaterElement {
    public static void main(String args[]){
        int arr [] = {7,2,5,0,6,8,1};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i = arr.length-1; i>= 0; i--){
            //while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //if-else
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            } else{
                nxtGreater[i] = arr[s.peek()];
            }
            //push in stack
            s.push(i);
        }
        for(int i =0; i<nxtGreater.length ; i++){
            System.out.print(nxtGreater[i] + " ");
        }
    }
    
}
