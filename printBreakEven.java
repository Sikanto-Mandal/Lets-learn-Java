import java.util.*;
public class printBreakEven {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        
        

        do{
            System.out.print("Enter your number : ");
            int num = sc.nextInt();
            if (num % 2 == 0){
            break;
        }
        System.out.println(num);
        } while(true);
        }
    
}
