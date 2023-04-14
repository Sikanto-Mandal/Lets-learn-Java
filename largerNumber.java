import java.util.*;
public class largerNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number : ");
        int num1= sc.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        
        if(num1 > num2){
            System.out.println("The larger number is : " + num1);
        }
        else {
            System.out.println("The larger number is : " + num2);
        }


    }
    
}
