/*You are given an array prices where prices[i] is the price of a given stock on the ith day. 
 You want to maximize your profit by choosing a single day to buy 
 one stock and choosing a different day in the future to sell that stock. 
 Rutrurn the maximum profit you can achieve form this transaction.
 It you cannot achieve any profit, return 0;
 prices []={7,1,5,3,6,4}
 */
public class buyAndSellStocks {
    public static int buySellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int i =0; i< prices.length; i++){

            //profit
            if(buyPrice <prices[i]){
                //today's profit
                int profit = prices[i]-buyPrice;
                maxProfit =Math.max(maxProfit,profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[] = { 7, 1, 5, 3, 6, 4};
       System.out.println( buySellStock(prices));

    }
            
}
