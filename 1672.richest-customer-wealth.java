/*
 * @lc app=leetcode id=1672 lang=java
 *
 * [1672] Richest Customer Wealth
 */

// @lc code=start
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<accounts.length; i++){
            int Sum = 0;
            for(int j=0; j<accounts[i].length; j++){
                Sum += accounts[i][j];
            }
            maxi = Math.max(maxi, Sum);
        }
        return maxi;
    }
}
// @lc code=end

