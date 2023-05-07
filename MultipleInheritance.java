public class MultipleInheritance {
    public static void main(String args[]){
        Beer b = new Beer();
        b.eat();
        b.live();
    }
}
interface Harbivore{
    void eat();

}
interface Carnivore{
     void live();

}
class Beer implements Harbivore, Carnivore{
    public void eat(){
        System.out.println("Eats mass");
    }
    public void live(){
        System.out.println("Live in Jungle.");
    }

}