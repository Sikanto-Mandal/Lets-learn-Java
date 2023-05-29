public class PrivateConstruction {
    static class Vehicle{
        private Vehicle(){
            System.out.println("Vehicle construction is called...");
        }
    }
    public static  void main(String arg[]){
        Vehicle v = new Vehicle();

    }
    
}
 