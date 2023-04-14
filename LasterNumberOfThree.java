import java.util.*;
public class LasterNumberOfThree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd Number : ");
        int num2 = sc.nextInt();

        System.out.print("Enter the 3rd Number : ");
        int num3 = sc.nextInt();

        if( num1 > num2){
            if(num1 > num3){
                System.out.print("The largest number is : " + num1);
            }
            else if (num2 > num3){
                System.out.print("The largest number is : " + num2);
            }

        }
        else {
            System.out.printf("The largest number is : " + num3);

            }
    }
}
