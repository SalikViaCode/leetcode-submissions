class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] - nums[i-1] > 0){
                ans += nums[i] - nums[i-1];
            }
        }
        return ans;
    }
}