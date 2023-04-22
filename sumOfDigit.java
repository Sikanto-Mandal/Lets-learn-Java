import java.util.*;
public class sumOfDigit {
    public static int sumDigit(int n){
        int number = n;

        int sum = 0;
        while(n >0 ){
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;

        }
        return sum;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        
        int num = sc.nextInt();

        int sumOfDigit =  sumDigit(num);
        System.out.print("Your sum of digit " + num + " is = " + sumOfDigit);
    }
    
}
