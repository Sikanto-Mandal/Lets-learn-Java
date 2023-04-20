import java.util.*;
public class checkPrimeNumber {

    //function for check prime number
    public static boolean isPrime(int n){
        // boolean isPrime = true;

        if(n == 2){
            return true;
        } 
        else{

        for(int i =2; i <= (n-1); i++ ){
            if (n % i == 0){
                // isPrime = false;
                // break;
                return false; 
            }
             
        }
        // return isPrime;
        return true;
    }
    }
        
        
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number :");

        int num = sc.nextInt();

        boolean checkPrime = isPrime(num);
        System.out.print(checkPrime);

    }
    
}
