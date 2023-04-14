import java.util.*;
public class ThreeItemsBill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pen Price");
        float pen = sc.nextFloat();
        
        System.out.println("Enter pencil price ");
        float pencil = sc.nextFloat();

        System.out.println("Enter eraser price");
        float eraser = sc.nextFloat();

        double price = ((pen+0.18) + (pencil+ 0.18) + (eraser+0.18));
        System.out.print("Total Price = ");
        System.out.println(price);
    }
    
}
