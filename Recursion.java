import java.util.*;
public class Recursion {
    public static void printHelloWorld(int n){
        if (n ==0){    
            // System.out.println("Hello World");        
            return;
        }
        printHelloWorld(n-1);
        System.out.println("Hello World " + n);
        

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        
        int n = sc.nextInt();
        printHelloWorld(n);

    }
    
}
