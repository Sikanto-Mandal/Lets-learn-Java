public class SumOfNnaturalNoRecursion {
    public static int sumN(int n){
        if (n == 0){
            return 0;
        }
        int snm1 = sumN(n-1);
        int sum = n + snm1;
        return sum;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(sumN(n));
    }
    
}
