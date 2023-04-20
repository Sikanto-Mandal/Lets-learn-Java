public class fuctionOverloading {

    //function of sum two numbers

    public static int sum(int a, int b){
        return a + b;

    }
     // Function of sum three numbers-

     public static int sum (int a, int b, int c){
        return a + b + c;
     }
    public static void main(String args[]){

        System.out.println(sum(3,2));
        System.out.println(sum(3,4,5));

    }
    
}
