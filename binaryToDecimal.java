import java.util.*;
public class binaryToDecimal {

    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum += lastDigit*Math.pow(2,pow);
            pow++;
            binNum /= 10;
        }
        System.out.print("Decimal of " + myNum + " is = " + decNum);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in );

        System.out.print("Enter your binary number (0's and 1's ) : ");

        int binaryNumber = sc.nextInt();

        binToDec(binaryNumber);
    }
    
}
