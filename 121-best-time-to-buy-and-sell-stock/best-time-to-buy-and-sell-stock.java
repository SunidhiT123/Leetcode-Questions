class Solution {
    public int maxProfit(int[] prices) {
        int MinPrice=Integer.MAX_VALUE;
        int MaxProfit=0;
        for(int i=0;i<prices.length;i++){
            MinPrice=Math.min(prices[i],MinPrice);
            int profit=prices[i]-MinPrice;
            MaxProfit=Math.max(profit,MaxProfit);
        }
        return MaxProfit;
    }
}