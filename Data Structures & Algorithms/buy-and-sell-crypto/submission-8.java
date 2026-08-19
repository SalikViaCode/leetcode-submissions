class Solution {
    public int maxProfit(int[] nums) {
        int minPrice = nums[0];
        int maxProfit = 0;
        int n = nums.length;
        for(int i = 1; i < n; i++){
            int res = nums[i] - minPrice;
            minPrice = Math.min(nums[i], minPrice);
            maxProfit = Math.max(maxProfit, res);
        }
        return maxProfit;
    }
}
