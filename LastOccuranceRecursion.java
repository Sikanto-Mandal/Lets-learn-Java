public class LastOccuranceRecursion {
    public static int lastOccur(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccur(arr, key, i+1);

        if(isFound != -1){
            return isFound;
            
        }
        // check with self
        if(arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
        int arr [] = { 1,2,3,4,5,1,6,7,8,9};
        System.out.print(lastOccur(arr, 1, 0));

    }
    
}
