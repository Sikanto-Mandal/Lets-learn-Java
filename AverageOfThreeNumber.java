import java.util.*;
public class AverageOfThreeNumber {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the 1st number;");
        int num1 =sc.nextInt();

        System.out.println("Enter the 2nd number");
        int num2 = sc.nextInt();

        System.out.println("Enter the 3rd Number ");
        int num3 = sc.nextInt();

        int average = (num1 + num2 + num3 )/3;

        System.out.println("Average of Three Number = ");
        System.out.println(average);
    }
    
}
