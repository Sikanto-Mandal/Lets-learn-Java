/*Question 1 : For a given integer array of size N. You have to find all the occurrences
(indices) of a given element (Key) and print them. Use a recursive function to solve this
problem.
Sample Input : arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
Sample Output : 1 5 7 8 */

public class RecursionBasics1 {
    public static int allOccurrences(int arr[], int key, int i){
        if( i == arr.length){
            return -1;
        }
        if (arr[i] == key){
            System.out.print(i +" ");
        }
        return allOccurrences(arr, key, i+1);
    }
    public static void main(String args[]){
        int key = 2;
        int arr[]={3,2,4,5,6,2,7,2,2,};
        allOccurrences(arr, key, 0);

    }
    
}
