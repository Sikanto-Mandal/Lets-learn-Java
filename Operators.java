import java.util.*;
public class Operators{
    public static void main (String args []){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = sc.nextInt();

        for(int i = 1; i<=num; i++){
            if (i % 3 == 0 || i% 2 == 0){
               
                continue;
            }
            System.out.println("Digit = " + i);
           
        }
      
    }

}