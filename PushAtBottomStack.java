import java.util.*;
public class PushAtBottomStack {
    public static void pushAtBottom(Stack<Integer>s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a bottom push element : ");
        int data = sc.nextInt();

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, data);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
