class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0, res = 0;
        Set<Character> set = new HashSet<>();
        for(int j = 0; j < n; j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i++));
            }
            set.add(s.charAt(j));
            res = Math.max(res, j-i+1);
        }
        return res;
    }
}
