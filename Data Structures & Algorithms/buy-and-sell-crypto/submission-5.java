class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length;
        int minPrice = nums[0];
        int maxProfit = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int res = nums[i] - minPrice;
            maxProfit = Math.max(res, maxProfit);
            minPrice = Math.min(minPrice, nums[i]);
        }
        return maxProfit;
    }
}