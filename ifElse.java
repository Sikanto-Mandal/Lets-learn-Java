import java.util.*;
public class ifElse {
    public static void main(String args[]){
        System.out.print("Enter the Age :");
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You can go for Vote\n");
        } 
        if(age > 13 && age < 18){
            System.out.println("Teenager");
        }
        else {
            System.out.println("Not Adult");

        }
        
    }
    
}
