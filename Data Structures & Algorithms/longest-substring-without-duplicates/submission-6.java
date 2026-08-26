class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0;
        int res = 0;
        Set<Character> set = new HashSet<>();
        for(int j = 0; j < n; j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i++));
            }
            res = Math.max(res, j-i+1);
            set.add(s.charAt(j));
        }
        return res;
    }
}
