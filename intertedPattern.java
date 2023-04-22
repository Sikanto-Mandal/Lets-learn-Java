import java.util.*;
public class intertedPattern {

    public static void interted_pattern(int n){
        for (int i =1; i <=n; i++){
            for (int j=1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j =1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // System.out.println();
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter your enter : ");
            int num = sc.nextInt();
            interted_pattern(num);

        
    }
    
}
