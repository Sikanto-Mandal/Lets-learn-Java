import java.util.Scanner;
public class prefixArray {
    public static void maxSumSubArrays(int number[]){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[]= new int[number.length];
        prefix[0] = number[0];
        //calculate prefix array
        for(int i =1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + number[i];
        }
        for(int i = 0; i<number.length; i++){
            int start =i;
            for(int j = i; j < number.length; j++){
                int end =j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum <currSum){
                    maxSum =currSum;
                }

            }
        }
        System.out.println("Maximum is " + maxSum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[6];
        System.out.println("Enter your Arrays Elements : ");
        for(int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();

        }
        maxSumSubArrays(arr);
    }
    
}
