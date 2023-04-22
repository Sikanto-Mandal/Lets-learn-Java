import java.util.*;
public class floydsTriangle {
    public static void floydPattern(int n){
        int counter = 1;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter ++;
            }
            System.out.println();
        }
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number for Floyd's Triagnle : ");
        int num = sc.nextInt();

        floydPattern(num);

    }
    
}
