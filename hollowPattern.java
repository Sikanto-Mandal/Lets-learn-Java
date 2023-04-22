import java.util.*;
public class hollowPattern {

    public static void pattern(int row, int col){
        for(int i = 1; i <= row; i++){
            for (int j =1; j <= col; j++){
                if (i == 1 || i == row || j == 1 || j == col){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                

            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the rows :");
        int rows = sc.nextInt();

        System.out.print("Enter your collumns : ");
        int collums = sc.nextInt();

        pattern(rows, collums);
    }
    
}
