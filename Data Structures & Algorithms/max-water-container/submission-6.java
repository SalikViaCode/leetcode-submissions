class Solution {
    public int maxArea(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int max = 0;
        while(l < r){
            int area = (r-l) * Math.min(nums[l], nums[r]);
            max = Math.max(area, max);
            if(nums[l] < nums[r])   l++;
            else r--;
        }
        return max;
    }
}
