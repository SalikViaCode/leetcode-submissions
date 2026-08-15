class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length;
        int minPrice = nums[0];
        int maxProfit = 0;
        int i = 0;
        for(int  j = 1; j < n; j++){
            int res = nums[j] - minPrice;
            minPrice = Math.min(minPrice, nums[j]);
            maxProfit = Math.max(maxProfit, res);
        }
        return maxProfit;
    }
}
