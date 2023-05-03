public class stringFunCompare {
    public static void main(String args[]){
        String s1 = "Sikanto";
        String s2 = "Sikanto";
        String s3 = new String("Sikanto");

        //Here if we use == sign then it will show that it is not equal
        //That's why I use .equals function to compare equality.

        if (s1.equals(s3)){
            System.out.println("Equal String.");
        }
        else {
            System.out.println("Not equal String.");
        }
    }
    
}
