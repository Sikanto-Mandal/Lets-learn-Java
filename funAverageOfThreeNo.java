import java.util.*;
public class funAverageOfThreeNo {
    public static  int printAverage(int a, int b, int c){
        int average = (a + b + c)/3;
        return average;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your 1st number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter your second number : ");
        int num2 = sc.nextInt();

        System.out.print("Enter your 3rd number : ");
        int num3 = sc.nextInt();

       int avg=  printAverage(num1, num2, num3);

       System.out.print(avg);
    }
    
}
