import java.util.*;
public class solidRhombusPattern {
    public static void rhobusPattern(int n){
        //outter loop
        for(int i =1; i <= n; i++){

            //space
            for(int j =1; j <= (n-i); j++){
                System.out.print("   ");
            }
            
            //stars
            for(int j = 1; j <= n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        rhobusPattern(num);
    }
}
