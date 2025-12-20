class Solution {
    public int maxProfit(int[] prices) {

        // Approch brute force
        // int maxProfit =0;
        // int buyerPrice =0;
        // int currentProfit =0;
        // for(int i =0;i<prices.length-1; i++){
        //     for(int j=i+1; j< prices.length; j++){
        //         buyerPrice = prices[i];
        //         currentProfit = prices[j] -  buyerPrice;
        //         if(maxProfit<currentProfit){
        //             maxProfit = currentProfit;
        //         }
        //     }

        // }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }
            else if(price - minPrice >maxProfit){
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
        
    }
}