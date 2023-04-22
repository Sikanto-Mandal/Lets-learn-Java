import java.util.*;
public class palindromeNumber {
    public static int checkPalindrome(int n){
        int reserve = 0;
        
        while(n >0){
            int remainder = n %10;
            reserve = (reserve * 10) + remainder;
            n = n / 10;
        }
        return reserve;
        

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");

        int num = sc.nextInt();

        int palindrome =checkPalindrome(num);
        
        if(palindrome == num){
            System.out.print("Palindrome number : " + num);
        }
        else {
            System.out.print("Not palindrome number : " + num);
        }

        
    }
    
}
