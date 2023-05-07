public class Inherited {
public static void main(String args[]){
    Bird pigeon = new Bird();
    pigeon.fly();
    pigeon.eat();

    Shark fish = new Shark();
    fish.eat();
    fish.fins();
    fish.swim();


}  
}
class Animal{
    String color;
    void eat(){
        System.out.println("Eat");
    }
}
class Mammal extends Animal {
    void walk(){
        System.out.println("walk");
    }
}
class Bird extends Animal {
    void fly(){
        System.out.println("fly");
    }
}
class Fish extends Animal{
    void swim (){
        System.out.println("Swim");
    }
}
class Shark extends Fish{
    void fins(){
        System.out.println("Fins");
    }
}
