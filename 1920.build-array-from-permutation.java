/*
 * @lc app=leetcode id=1920 lang=java
 *
 * [1920] Build Array from Permutation
 */

// @lc code=start
class Solution {

    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};

        int[] ans = buildArray(nums);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
// @lc code=end

