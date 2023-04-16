import java.util.*;
public class primeNumber {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number : ");
   
   int num = sc.nextInt();
   if(num == 2){
    System.out.print("PRIME NUMBER");
    }
    else{
        boolean isPrime = true;
 
        for(int i =2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                isPrime = false;
            }    
        }
        if (isPrime == true){
            System.out.print("PRIME NUMBER");
        }
        else {
            System.out.print("NOT PRIME NUMBER ");
        }


    }


}
    
}
