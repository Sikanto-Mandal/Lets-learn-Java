import java.util.*;
public class leapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Year ");
        int year = sc.nextInt();

        if (year % 4 ==0){
            System.out.print("Leap Year : " + year );
        }
        else {
            System.out.print("Not Leap Year : " + year);
        }

    }
}
