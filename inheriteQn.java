public class inheriteQn {
    public static void main (String args[]){
        Vehicle v = new Car();
        v.print1();

        Vehicle c = new Vehicle();
        c.print1();

    }
    
}
class Vehicle {
    void print1(){
        System.out.println("Base class(Vehicle)");
    }
}
class Car extends Vehicle{
    void print1(){
        System.out.println("Derived class (Car)");
    }
}
