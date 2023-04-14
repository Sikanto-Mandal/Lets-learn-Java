import java.util.*;
public class statementSwitch {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-5) : ");
        int number = sc.nextInt();

        switch(number){
            case 1 : System.out.print("GO TO COLLEGE");
                    break;
            case 2 : System.out.print("GO FOR LUNCH");
                    break;
            case 3 : System.out.print("GO FOR DINNER");
                    break;
            case 4 : System.out.print("GO FOR BREAKFAST");
                    break;
            
            case 5 : System.out.print("GO FOR SNACKES");
                    break;
            default : System.out.print("CHOOSE CORRECT NUMBER ");
        }
    } 
    
}
