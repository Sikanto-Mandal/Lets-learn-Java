import java.util.*;
public class butterflyPattern {
    public static void butterFly(int n){
        //outter loop
        for(int i = 1; i <= n; i++ ){

            // stars
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //spaces 
                for(int j =1; j <= 2*(n-i); j++ ){
                    System.out.print(" ");
                }

                //stars
                    for(int j = 1; j <= i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
        }
        //inverted pattern
        //outloop
        for(int i = n;  i >= 1; i -- ){

            //stars
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }

            //space
                for(int j = 1; j <= 2*(n-i); j++){
                    System.out.print(" ");
            }
                    
            //stars
                for(int j =1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            

        }

}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");

        int num = sc.nextInt();

        butterFly(num);
    }
    
}
