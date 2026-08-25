class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        Set<Integer> set = new HashSet<>();
        for(int j = 0; j < n; j++){
            if(j-i > k){
                set.remove(nums[i++]);
            }
            if(set.contains(nums[j]))   return true;
            set.add(nums[j]);
        }
        return false;
    }
}