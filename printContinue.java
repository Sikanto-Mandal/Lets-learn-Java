import java.util.*;
public class printContinue {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        for(int i= 1; i<= num; i++){
            if (i %3 ==0){
                
                continue;
            }
            System.out.print(i + " ");
           
        }
    }
    
}
