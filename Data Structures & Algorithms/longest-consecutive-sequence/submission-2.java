class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0)  return 0;
        Arrays.sort(nums);
        int count = 0;
        int max = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i-1])    continue;
            if(nums[i] == nums[i-1] + 1){
                count++;
                max = Math.max(max, count);
            } else  count = 0;
        }
        return max + 1;
    }
}
