class Solution {
    public int maxProfit(int[] prices) {
        // two pointer approach, L,R both moves from left, if loss,
        // move both, otherwise move only R
        int l = 0;
        int r = 1;
        int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (r == prices.length) {
                // exit if r reaches end
                continue;
            }
            if (prices[r] < prices[l]) {
                l=r;
                r++;
            } else {
                profit = Math.max(prices[r] - prices[l], profit);
                r++;
            }
        }
        return profit;
    }
}