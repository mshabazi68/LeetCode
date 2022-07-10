//Best Time to Buy and Sell Stock II
public int maxProfit2(int[] prices)
        {
            var maxProfit = 0;
            for (int i = 1; i < prices.Length; i++)             
            {                 
                if (prices[i] - prices[i - 1] > 0)
                {
                    maxProfit += prices[i] - prices[i - 1];
                }
            }

            return maxProfit;
        }
