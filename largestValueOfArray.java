import java.util.*;
public class largestValueOfArray {
    public static int getLarget(int num[]){
        int largest = Integer.MIN_VALUE; //- infinity
        int smallest = Integer.MAX_VALUE; // + infinity
        for(int i =0; i<num.length; i++){
            if(largest < num[i] ){
                largest = num[i];
            }
            if(smallest > num[i]){
                smallest = num[i];
            }
            
        }
        System.out.println("Smallest value is : " + smallest);
        return largest;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int number[]= new int[5];

        for(int i = 0; i <number.length; i++){
            System.out.print("Enter your array elements : ");
            number[i]=sc.nextInt();
        }
        //To print array elements :-
        System.out.println("Your array elements are : ");
        for(int i =0; i <number.length; i ++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
        System.out.print("largest value is : " + getLarget(number));
    }
    
}
