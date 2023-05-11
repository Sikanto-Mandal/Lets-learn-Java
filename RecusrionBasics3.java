/*Question 3 : Write a program to find Length of a String using Recursion.
 */
public class RecusrionBasics3 {
    public static int stringLength (String str){
       if(str.length() == 0){
        return 0;
       }
       return stringLength(str.substring(1))+1;
    }
    public static void main(String args[]){
        String str = "Sikanto";
        System.out.print(str + " = ");
        System.out.println(stringLength(str));          
    }
    
}
