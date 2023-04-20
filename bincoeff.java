import java.util.*;
public class bincoeff {
    public static int factorial(int n){
        int fact =1;
        for (int i =1; i<= n; i++){
            fact *=i;
        }
        return fact;
    }

    public static int binomialcoeff(int n, int r){

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binomialcoeff = fact_n / (fact_r *fact_nmr);
        return binomialcoeff;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two  numbers  n and r : ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int binomicoeffient = binomialcoeff(num1,num2);

        System.out.println("Binomial Coeffient is = " + binomicoeffient);

        // System.out.print(binomialcoeff(5,2));

       


    }
    
}
