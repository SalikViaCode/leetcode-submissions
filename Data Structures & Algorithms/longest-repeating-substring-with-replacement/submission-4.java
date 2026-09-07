class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(s.charAt(i));
        }
        int  res = 0;
        for(char c : set){
            int l = 0, count = 0;
            for(int r = 0; r < n; r++){
                if(s.charAt(r)==c){
                    count++;
                }
                while(r-l+1 - count > k){
                    if(s.charAt(l)==c){
                        count--;
                    }
                    l++;
                }
                res = Math.max(res, r-l+1);
            }
        }
        return res;
    }
}
