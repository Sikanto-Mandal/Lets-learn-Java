import java.util.*;
public class spiralMatrix {
    public static void printSpiral(int matrix [][]){
        int startRow =0;
        int startCol =0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol ){
            //top boundry
            for(int j = startCol; j <= endCol; j++){
                System.out.print(matrix[startRow][j]+ " ");
            }
            // right boundry
            for(int i= startRow+1; i <= endRow; i++){
                System.out.print(matrix [i][endCol] + " ");
            }

            //bottom boundry
            for(int j = endCol-1; j >= startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left boundry

            for(int i = startRow-1; i >= startRow+1; i-- ){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }
        System.out.println();

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][]= new int[4][4]; 
        System.out.println("Enter your Arrays elements : ");
        for(int i = 0; i<matrix.length; i++){
            for(int j =0; j<matrix.length; j++){
            matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("You Array is : ");
        for(int i =0; i < matrix.length; i++){
            for(int j =0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("\n");
        }

        System.out.println("Your spiral Matrix is : \n");
        printSpiral(matrix);
    }
    
}
