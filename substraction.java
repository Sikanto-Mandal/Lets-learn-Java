import java.util.*; //It is show the sum of two numbers in double
public class substraction {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        double subs = num1 - num2;
        System.out.print ("Sum is = " + subs);
    }
    
}
