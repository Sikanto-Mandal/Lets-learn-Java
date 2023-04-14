import java.util.*;
public class positiveNegativeNumber {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if(num >= 0){
            System.out.print("POSITIVE NUMBER");
        }
        else {
            System.out.print("NEGATIVE NUMBER");
        }
    }
    
}
