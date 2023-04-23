import java.util.*;
public class diamondPattrn {
    public static void diamond_pattern(int n){
        // out loop
        for (int i =1; i <= n; i++){

            //spaces
            for(int j =1; j <= (n-i); j++){
                System.out.print(" ");
            }

            // stars
            for(int j= 1; j <= (( 2* i)-1); j++){
                System.out.print("*");

            }
            System.out.println();

        }
        //inverted loop
        for (int i =n; i >= 1; i--){
            for(int j =1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        diamond_pattern(num);
    }
    
}
