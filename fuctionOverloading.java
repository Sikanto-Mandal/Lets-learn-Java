public class fuctionOverloading {

    //function of sum two numbers

    public static int sum(int a, int b){
        return a + b;

    }
    //  // Function of sum three numbers-

    //  public static int sum (int a, int b, int c){
    //     return a + b + c;
    //  }

    //function of sum of float numbers

    public static float sum(float a, float b){
        return a + b;
    }
    public static void main(String args[]){

        System.out.println(sum(3,2));

        // System.out.println(sum(3,4,5));

        System.out.println(sum(3.5f, 1.5f));

    }
    
}
