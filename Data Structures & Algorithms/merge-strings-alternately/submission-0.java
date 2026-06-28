class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        StringBuilder res = new StringBuilder();
        int i = 0, j = 0;
        while(i < n && j < m){
            res.append(word1.charAt(i++));
            res.append(word2.charAt(j++));
        }
        res.append(word1.substring(i));
        res.append(word2.substring(j));
        return res.toString();
    }
}