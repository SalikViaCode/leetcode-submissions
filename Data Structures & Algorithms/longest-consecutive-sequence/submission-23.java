class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0)    return 0;
        // Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int count = 0, res = 0;
        for(int i = 1; i < n; i++){
            if(nums[i]==nums[i-1])  continue;
            else if(nums[i] == nums[i-1]+1)   count++;
            else count = 0;
            res = Math.max(res, count);
        }
        return res+1;
    }
}
