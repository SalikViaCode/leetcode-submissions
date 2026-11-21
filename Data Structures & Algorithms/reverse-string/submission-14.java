class Solution {
    public void reverseString(char[] nums) {
        int n = nums.length;
        int l = 0, r = n-1;
        while(l <= r){
            char temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }
    }
}