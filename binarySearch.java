import java.util.*;
public class binarySearch {
    public static int printBinarySearch(int num[], int key){
        int start = 0, end = num.length -1;

        while(start <= end){
            int mid = (start + end)/2;
            //comparisions
            if (num[mid] == key){
                return mid;
            }
            if (num[mid] < key){
                start = mid+1;
            }
            else {
                end = mid-1;
            }

        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your key : ");
        int key = sc.nextInt();
        int number[]= new int[5];
        for(int i =0; i < number.length; i++){
            System.out.print("Enter your Array element : ");
            number[i] = sc.nextInt();
        }
        System.out.println ("your array elements are : ");
        for(int i =0; i < number.length; i++){
            System.out.print(number[i] +" ");
        }
        
        System.out.println("\nindex for key is : " +printBinarySearch(number, key));
        
    }
    
}
