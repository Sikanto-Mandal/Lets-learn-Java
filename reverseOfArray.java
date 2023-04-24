public class reverseOfArray {
    public static void reverse(int num[]){
        int first =0, last = num.length-1;
        while(first < last){
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first ++;
            last --;
        }
    }
    public static void main(String args[]){
        int number[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        //present array
        System.out.println("Present Array : ");
        for(int i = 0; i < number.length; i++){
            System.out.print(number[i]+ " ");
        }
        reverse(number);
        
        // print reversed array
        System.out.println("\n\nReversed Array : ");
        for(int i = 0; i < number.length; i++){
            System.out.print(number[i]+ " ");
        }
        System.out.println();
    }
    
}
