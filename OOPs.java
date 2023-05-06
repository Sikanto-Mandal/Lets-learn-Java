public class OOPs {
    public static void main(String args[]){
        Pen p = new Pen();
        p.setColor("Red");
        System.out.println(p.color);

        p.setTip(5);
        System.out.println(p.tip);

    }
    
}
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }

}
