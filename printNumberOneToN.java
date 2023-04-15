import java.util.*;
public class printNumberOneToN {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the range : ");

        int num = sc.nextInt();

        int counter = 1;
        while(counter <= num){
            System.out.print(counter + " ");
            counter ++;

        }

    }
    
}
