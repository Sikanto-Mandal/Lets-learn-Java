import java.util.*;
public class GetterAndSetter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Pen p1 = new Pen();

        System.out.print("Enter your Color :");

        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

    }
    
}
class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip (int tip){
        this.tip = tip;
    }
}
