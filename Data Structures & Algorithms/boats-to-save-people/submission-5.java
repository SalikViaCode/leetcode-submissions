class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        Arrays.sort(nums);
        int res = 0;
        while(l <= r){
            int remain = limit - nums[r--];
            res++;
            if(l <= r && nums[l] <= remain)  l++;
        }
        return res;
    }
}