import java.util.*;
public class printMaxSubArrays {
    public static void maxSumSubArrays(int arr[]){
      //  int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            // int start =i;
            for(int j =i; j<arr.length; j++){
                // int end =j;
               int currSum =0;
                for(int k =i; k <= j; k++){
                    currSum += arr[k];
                }
                System.out.print(currSum + " ");
                if (maxSum <currSum){
                    maxSum = currSum;
                }
                
                
            }
        }
        System.out.print("\nMaximum of Sum SubArray : " + maxSum);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in );
        int arr[] = new int[6];
        System.out.println("Enter your Array Elements : ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("Your Sum SubArrays : ");
        maxSumSubArrays(arr);
    }
    
}
