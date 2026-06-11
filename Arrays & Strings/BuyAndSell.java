class BuyAndSell {
    public int maxProfit(int[] prices){
        int n = prices.length; 
        int maxi = 0; 
        int mini = Integer.MAX_VALUE; 
        for(int i = 0; i< n ; i++){
            mini = Math.min(mini, prices[i]);
            maxi = Math.max(maxi, prices[i]-mini); 
        }
        return maxi; 
    }
    public static void main(String[]args){
        int [] prices = {7,1,5,3,6,4}; 
        int result = new BuyAndSell().maxProfit(prices);
        System.out.println(result);
    }
}