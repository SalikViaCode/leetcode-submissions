class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int i = 0, max = 0;
        for(int j = 0; j < n; j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i++));
            }
            set.add(s.charAt(j));
            max = Math.max(max, j-i+1);
        }
        return max;
    }
}
