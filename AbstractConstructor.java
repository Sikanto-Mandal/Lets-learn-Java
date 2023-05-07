public class AbstractConstructor {
    public static void main(String args[]){
        BabyMustang myHorse = new BabyMustang();

    }
    
}
abstract class Animal{
    Animal(){
        System.out.println("Animal constructor is called...");
    }
}
class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor is called...");
    }
}
class Mustang extends Horse {
    Mustang(){
        System.out.println("Mustang constructor is called...");
    }
}
class BabyMustang extends Mustang {
    BabyMustang(){
        System.out.println("Babymustang constructor is called...");
    }
}
