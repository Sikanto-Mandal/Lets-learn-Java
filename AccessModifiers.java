public class AccessModifiers {
    public static void main(String args[]){
        BankAccount myAcc = new BankAccount();
        myAcc.username = "mandalsikanto";

        /* myAcc.password = "abcd"; //not visible */

        myAcc.setPassword("123546");
        System.out.println(myAcc.getPassword());

      

    }
    
}
class BankAccount{
    public String username;
    private String password;



    String getPassword(){
        return this.password;
    }
    void setPassword(String newPassword){
        this.password = newPassword;
    }

}
