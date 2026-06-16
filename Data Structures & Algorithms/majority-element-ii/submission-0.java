class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> count = new HashMap();
        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        List<Integer> res = new ArrayList<>();
        for(int key : count.keySet()){
            if(count.get(key) > n/3){
                res.add(key);
            }
        }
        return res;
    }
}