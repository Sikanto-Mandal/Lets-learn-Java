import java.util.*;
public class evenOddSum {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.print("Enter your number : ");
            number = sc.nextInt();

            if(number % 2 == 0){
                evenSum +=number;
            } else {
                oddSum +=number;
            }
            System.out.println("Do you want to continue ? \nPress 1 for yes or press 0 for no");
            choice = sc.nextInt();
        } while(choice ==1);

        System.out.println("Sum of even number : " + evenSum);
        System.out.println("Sum of Odd number : " + oddSum);

    }
    
}
