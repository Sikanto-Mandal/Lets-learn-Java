public class pairsArray {
    public static void printPairs(int num[]){
        for(int i =0 ; i <num.length; i++){
            int currentElement = num[i]; // 2,4,6,8,10
        
            for(int j = i+1; j< num.length; j++){
                System.out.print("("+ currentElement +"," + num[j] + ")");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        int number []={ 2, 4, 6, 8, 10};

        printPairs(number);
    }
    
}
