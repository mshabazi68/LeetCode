/*
You have planned some train traveling one year in advance. The days of the year in which you will travel are given as an integer array days. Each day is an integer from 1 to 365.

Train tickets are sold in three different ways:

a 1-day pass is sold for costs[0] dollars,
a 7-day pass is sold for costs[1] dollars, and
a 30-day pass is sold for costs[2] dollars.
The passes allow that many days of consecutive travel.

For example, if we get a 7-day pass on day 2, then we can travel for 7 days: 2, 3, 4, 5, 6, 7, and 8.
Return the minimum number of dollars you need to travel every day in the given list of days.

*/


class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[][] dp = new int[400][400];
        int s = days[0];
        int e = days[n - 1];
        for (int i = 0; i < 400; i++) {
            Arrays.fill(dp[i], 0x3fffffff);
        }
        for (int i = 0; i < n; i++) {
            dp[days[i]][days[i]] = costs[0];
        }
        for (int len = 1; len < n; len++) {
            for (int i = 0; i + len < n; i++) {
                int j = i + len;
                if (days[j] - days[i] < 7) {
                    dp[days[i]][days[j]] = Math.min(dp[days[i]][days[j]], costs[1]);
                }
                if (days[j] - days[i] < 30) {
                    dp[days[i]][days[j]] = Math.min(dp[days[i]][days[j]], costs[2]);
                }
                for (int k = i; k < j; k++) {
                    dp[days[i]][days[j]] = Math.min(dp[days[i]][days[j]], dp[days[i]][days[k]] + dp[days[k + 1]][days[j]]);
                }
            }
        }
        return dp[s][e];
    }
}
