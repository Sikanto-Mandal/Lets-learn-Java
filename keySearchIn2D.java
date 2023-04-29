import java.util.*;
public class keySearchIn2D {
    public static int search(int matrix[][], int key){
        for(int i =0; i < matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("found at cell (" + i + ","+j + ")");
                    return key;
                }
            }
        }
        System.out.println("Key not found! : " + key);
        return key;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix [][] = new int [3][3];
        System.out.print("Enter your matrix elements : ");
        //input matrix (n = matrix.length which is rows and m = matrix[0].length which is collumns)
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter your key : ");
        int key =sc.nextInt();
        // output matrix
        System.out.println("Your matrix is : ");
        for(int i =0; i <matrix.length; i++){
            for(int j = 0; j< matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix,key);
    }
   
}
