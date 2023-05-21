public class GridWays {
    public static int waysGrid(int i, int j, int n, int m ){
        //base

        if(i == n-1 && j == m-1){ // condtion for last cell
            return 1;
        }
        else if(i == n || j == m){
            return 0;
        }
        int w1 = waysGrid (i+1, j,n,m);
        int w2 = waysGrid(i, j+1, n, m);
        return w1 + w2;
    }   
    public static void main(String args[]){
        int n =3, m=3;
        System.out.println(waysGrid(0,0, n,m));
    }

    
}
