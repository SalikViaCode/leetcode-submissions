class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null) return "";
        Arrays.sort(strs);
        int indx = 0;
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(i))    indx++;
            else break;
        }
        return s1.substring(0, indx);
    }
}