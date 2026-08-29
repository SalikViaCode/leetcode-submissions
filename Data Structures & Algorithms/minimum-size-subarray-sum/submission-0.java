class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 0, total = 0, res = Integer.MAX_VALUE;
        for(int r = 0; r < n; r++){
            total += nums[r];
            while(total >= target){
                res = Math.min(r-l+1, res);
                total -= nums[l++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}