class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        int n = nums.length;
        Arrays.sort(nums);
        int l = 0;
        int r = n-1;
        int res = 0;
        while(l <= r){
            int remain = limit - nums[r--];
            res++;
            if(l <= r && remain >= nums[l]) l++;
        }
        return res;
    }
}

//  5   1   4   2
//  1   2   4   5
//  remain = 6-5 = 1
//  res = 1
//  l = 1
//  remain = 4-2 = 2
//  res = 2
//  l = 2
//