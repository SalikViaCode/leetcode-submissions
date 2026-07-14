class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length;
        int minPrice = nums[0];
        int maxProfit = 0;
        for(int i = 1; i < n; i++){
            int res = nums[i] - minPrice;
            maxProfit = Math.max(maxProfit, res);
            minPrice = Math.min(nums[i], minPrice);
        }
        return maxProfit;
    }
}
