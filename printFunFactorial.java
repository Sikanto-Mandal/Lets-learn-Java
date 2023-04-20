import java.util.*;
public class printFunFactorial {

    public static int printFactorial(int n){
        int fact =1;
        for (int i = 1; i <= n; i++){
            fact = fact *i;

        }
        return fact; 

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Factorial number : ");
        int num = sc.nextInt();

        int fact = printFactorial(num);
        System.out.print("Factorial of " + num + " is = "+ fact);



    }
    
}
