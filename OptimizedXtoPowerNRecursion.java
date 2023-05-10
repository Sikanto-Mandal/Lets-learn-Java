public class OptimizedXtoPowerNRecursion {
    public static int optPower(int x, int n){
        if (n ==0){
            return 1;
        }
        // int halfPowersq = optPower(x, n/2) * optPower(x, n/2);  // O(n)

        int halfPower = optPower(x, n/2);   //O(log n)
        int halfPowersq = halfPower * halfPower;

        // n is odd

        if (n %2 != 0){
            halfPowersq = x * halfPowersq; 
        }
        return halfPowersq;
    }
    public static void main(String args[]){
        int x, n;

        System.out.println(optPower(2,10));
    }
    
}
