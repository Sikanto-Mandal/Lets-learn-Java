
import java.util.*;
public class printSubArrays {
    public static void printSubArr(int arr []){
        int ts =0;
        for(int i =0; i<arr.length; i++){
            int start =i;
            for(int j=i; j<arr.length; j++){
                int end =j;
                for (int k =start; k<=end; k++){
                    System.out.print(arr[k] +" ");
                }
                ts ++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subArray = "+ts);
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter your Array Elements : ");
        for(int i = 0; i < arr.length; i ++){
            arr[i]= sc.nextInt();

        }
        System.out.println("Your Sub Arrays : ");
        printSubArr(arr);

    }
    
}
