class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int res = nums[l];
        while(l <= r){
            if(nums[l] < nums[r]){
                res = Math.min(nums[l], res);
                break;
            }

            int mid = (l+r)/2;

            res = Math.min(res, nums[mid]);

            if(nums[mid] >= nums[l])    l = mid + 1;
            else r = mid - 1;
        }
        return res;
    }
}