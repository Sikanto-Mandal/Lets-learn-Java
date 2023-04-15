import java.util.*;
public class sumOfNaturalNo {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int counter = 0, sum =0;

        while(counter <= num){
            sum = sum + counter;
            counter ++;
        }
        System.out.print("Sum is : " + sum);

    }
    
}
