class Solution {
    public int maxArea(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int res = 0;
        while(l < r){
            int area = (r-l) * Math.min(nums[l], nums[r]);
            res = Math.max(area, res);
            if(nums[l] < nums[r])   l++;
            else r--;
        }
        return res;
    }
}
