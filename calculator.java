import java.util.*;
public class calculator {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.print("Enter the operator : ");

        char op = sc.next().charAt(0);

        switch (op){
            case '+' : System.out.print (num1 + num2);
                      break;
            case '-' : System.out.print(num1 - num2);
                      break;
            case '*' : System.out.print(num1 * num2);
                      break;
            case '/' : System.out.print (num1 / num2);
                      break;
            case '%' : System.out.print(num1 % num2);
                      break;
            default  : System.out.print("Please choose a correct operator :) ");

        }
    }
    
}
