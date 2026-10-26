class Solution {
    public String longestCommonPrefix(String[] nums) {
		int n = nums.length;
		Arrays.sort(nums);
		String s1 = nums[0];
		String s2 = nums[n-1];
		int indx = 0;
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == s2.charAt(i))	indx++;
			else break;
		}
		return s1.substring(0, indx);
	}
}