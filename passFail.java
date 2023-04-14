import java.util.*;
public class passFail {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Marks ");
        int number = sc.nextInt();
    String marks =  number >= 33  ? "PASS" : "FAIL";

    System.out.print(marks);

    }    

}
