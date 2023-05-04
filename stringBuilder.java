public class stringBuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch= 'a'; ch <= 'z'; ch++){
            /*.append is used for add the value after the string.
             * Like string = apple
             * .append = a;
             * new string = applea  */
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
    
}
