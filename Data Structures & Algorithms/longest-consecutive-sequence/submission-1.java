class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int length = 0;
        Arrays.sort(nums);
        for(int num : nums){
            set.add(num);
        }
        int longest = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                int curr = num;
                length = 1;
                while(set.contains(curr+1)){
                    curr++;
                    length++;
                }
            }
            longest = Math.max(length, longest);
        }
        return longest;
    }
}