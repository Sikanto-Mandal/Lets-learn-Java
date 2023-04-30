/*Given n non- negative integers representing an elevating 
map where the width of each bar is 1, 
compute how much water is can trap after raining.
height = {4,2,0,6,3,2,5} */

public class trapppingRainWater {
    public static int trappedRainwater(int height[]){
    
        //calculate left max boundray-arrys
        int n = height.length;
        int leftMax[]= new int[n];
        leftMax[0]=height[0];
        
        for(int i =1; i<n; i++){
            leftMax[i]= Math.max(height[i],leftMax[i-1]);
        }

        //calculate right max boundary-array
        int rightMax[]= new int [n];
        rightMax[n-1]= height[n-1];
        for(int i = n-2; i>=0; i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        // loop
        int trappedWater =0;
        for(int i =0; i<n; i++){

            //waterLevel = min(lefMaxt boundary, righMaxt Boundry)
            int waterLevel =Math.min(leftMax[i],rightMax[i]);

            //trappedWater = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;       

    }
    public static void main(String args[]){
        int height[] ={ 4,2,0,6, 3, 2,5};
        System.out.println(trappedRainwater(height));
    }
    
}
