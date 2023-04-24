import java.util.*;
public class linearSearch {
    public static int printLinearSearch(int number[], int key){
        for(int i = 0; i < number.length; i++){
            if (number[i] == key){
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your key : ");
        int key = sc.nextInt();
        
        int number[] = new int[5];
        for(int i = 0; i < number.length; i++){
            System.out.print("Enter your number : " );
            number[i] = sc.nextInt();
        }
        int index = printLinearSearch(number, key);
        if (index == -1){
            System.out.print("Not found ");
        }
        else{
            System.out.print("Key at index : " + index);
        }

    }
    
}
