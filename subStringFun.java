public class subStringFun {
    public static String sub(String str, int si, int ei){
        String subStr = "";
        for(int i = si; i <ei ; i++){
            subStr  += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String args[]){
        String str = "HelloWorld";
        /*This is a inbuilt function is java for SubString. :  */
        // System.out.println(str.substring(0,5));

         System.out.print(sub(str,0,5));

    }
    
}
