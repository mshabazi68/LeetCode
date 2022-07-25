public class BestTimeToBuyAndSellStock121 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;

        int minSoFar = Integer.MAX_VALUE;
        int res = 0;

        for (int p: prices) {
            if (p > minSoFar) {
                res = Math.max(res, p - minSoFar);
            } else {
                minSoFar = p;
            }
        }

        return res;
    }

    public int maxProfit2(int[] prices) {
        int buy = Integer.MIN_VALUE;
        int sell = 0;
        for (int p: prices) {
            int oldBuy = buy;
            buy = Math.max(buy, - p);
            sell = Math.max(sell, oldBuy + p);
        }
        return sell;
    }

}
