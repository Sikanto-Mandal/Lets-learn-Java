import java.util.*;
public class isPrime {
    // for prime number
    public static boolean isPrime(int n){
        if (n == 2){
            return true;
        }
        for(int i =2; i<= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        System.out.print(isPrime(num));
    }
    
}
