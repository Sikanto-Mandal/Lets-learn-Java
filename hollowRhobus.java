import java.util.*;
public class hollowRhobus {

    public static void hollowRhombusPattern(int n){
        //outter loop
        for(int i = 1; i <= n; i++){

            //space
            for(int j =1; j <= (n-i); j++){
                System.out.print(" ");
            }

            //hollow rectangle - stars
            for(int j =1; j <= n; j++){
                if (i ==1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
               
            }        
            System.out.println();
    }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
            System.out.print("Enter your number : ");
            int num = sc.nextInt ();

            hollowRhombusPattern(num);


        }
    }
    

