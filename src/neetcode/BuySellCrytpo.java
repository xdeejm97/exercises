package neetcode;

public class BuySellCrytpo {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{10,1,5,6,7,1}));
    }

    public static int maxProfit(int[] prices) {

        int l = 0;
        int r = 1;
        int maxProfit = 0;
        while (r < prices.length){

            if(prices[l] < prices[r]){
                maxProfit = Math.max(maxProfit, prices[r] - prices[l]);
            }else {
                l = r;
            }
            r++;
        }
        return maxProfit;


    }
}
