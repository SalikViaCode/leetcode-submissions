class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        int n = nums.length;
        Arrays.sort(nums);
        int l = 0, r = n-1, res = 0;
        while(l <= r){
            int remain = limit - nums[r--];
            res++;
            if(l <= r && nums[l] <= remain) l++;
        }
        return res;
    }
}