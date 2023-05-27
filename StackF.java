import java.util.*;
public class StackF {
    public static void main(String args[]){
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(3);
        s.push(5);
        s.push(7);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();


        }
    }
}
