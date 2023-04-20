import java.util.*;
public class decimalToBinary {

    public static void decToBin(int decNum){
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while(decNum > 0){
            int rem = decNum % 2;

            binNum += rem*Math.pow(10,pow);
            pow ++;
            decNum = decNum /2;
        }
        System.out.print("Binary of " + myNum + " is = " + binNum);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your decimal number : ");
        int num = sc.nextInt();

        decToBin(num);
    }
    
}
