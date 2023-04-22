import java.util.*;
public class isEVen {
    public static boolean isEven(int n){
        if (n % 2 == 0){
            return true;
        }
        return false;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        System.out.print( isEven(num));
        

    }
    
}
