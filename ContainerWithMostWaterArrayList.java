import java.util.*;
public class ContainerWithMostWaterArrayList {
    // public static int storeWater(ArrayList<Integer>height){
    //     int maxWater =0;
    //     //brute force- O(n^2)

    //     for(int i =0; i<height.size(); i++){
    //         for(int j = i+1; j<height.size(); j++){
    //         int ht = Math.min(height.get(i), height.get(j));
    //         int width = j-i;
    //         int currWater = ht * width;
    //         maxWater = Math.max(maxWater, currWater);
    //         }
    //     }
    //     return maxWater;
    // }

    //2 pointer approach - O(n)
    public static int storeWater(ArrayList<Integer>height){
        int maxWater = 0;
        int lp =0;
        int rp = height.size()-1;

        while(lp<rp){
            //calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp -lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            //update ptr
            if(height.get(lp)< height.get(rp)){
                lp++;
            } else{
                rp --;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.print(storeWater(list));
    }
    
    
}
