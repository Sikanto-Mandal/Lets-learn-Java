import java.util.*;
public class pattern2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your pattern number : ");
        int n= sc.nextInt();

        for(int i = 1; i<= n; i++){
            for(int j =1; j<= i; j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
            
        }
    }
    
}
