/*Question 2 :
You are given a number (eg - 2019), convert it into a String of english like
“two zero one nine”. Use a recursive function to solve this problem.
NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
can’t be 0.
Sample Input : 1947
Sample Output : “one nine four seven”
 */

public class RecursionBasics2 {
    static String digits[] ={"Zero", "One", "Two", "Three","Four", "Five", "Six", "Seven", "Eight","Nine"};

    public static void printDigit(int number){
        if(number == 0){
            return;
        }
        int lastDigit = number %10;
        printDigit(number /10);
        System.out.print(digits[lastDigit]+ " ");
    }

    public static void main(String args[]){
        int number = 2003;
        System.out.print(number + " = ");
        printDigit(number);
    }
    
}
