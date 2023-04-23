import java.util.*;
public class printArray {
    public static void array(int num[]){
        // for(int i=1; i< num.length; i++){
        //     num[i] = num[i] + 1 ;
        // }
        System.out.println("Computer : " + num[0]);
        System.out.println("Math : " + num[1]);
        System.out.println("English : " + num[2]);
        System.out.println("Sanskrit : "+ num[3]);
        System.out.println("Hindi : " + num[4]);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number[] = new int[5];

        System.out.print("Enter your 5 subject numbers : ");
        for(int i= 0; i < number.length; i++){
            number[i]= sc.nextInt();

        }
        array(number);
        // for(int i =1; i < number.length; i++){
        //     System.out.println(number[i]);
        // }

    }
    
}
