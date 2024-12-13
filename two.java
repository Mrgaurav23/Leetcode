class two{
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {2,7,9,11};
        int target = 9;

        int[] ans = twoSum(nums, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static int[] twoSum(int[] nums,int target){
        int[] ans = new int[2];

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if (nums[i] + nums[j] == target && i!=j) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
}