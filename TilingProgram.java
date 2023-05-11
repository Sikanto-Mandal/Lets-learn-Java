/*Given a "2 x n" floar and tiles of size "2 x 1" 
count the nuber of ways to tile the given bound using the 2 x 1 tiles.
(A tile can either be place horizontally or vertically) */

public class TilingProgram {
    public static int tillingProgram(int n){
        //base case

        if (n == 0 || n == 1){
            return 1;
        }

        //kaam
         // vertical
         int fnm1 = tillingProgram(n-1);

         //horizontal
         int fnm2 = tillingProgram(n-2);

         int totalWays = fnm1 + fnm2;
         return totalWays;
}    
public static void main(String args []){
    System.out.println(tillingProgram(4));

    }
    
}
