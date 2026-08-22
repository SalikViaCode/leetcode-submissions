class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int res = 0;
        for(int i = 0; i < n; i++){
            set.add(s.charAt(i));
        }
        for(char c : set){
            int count = 0, l = 0;
            for(int j = 0; j < n; j++){
                if(s.charAt(j) == c){
                    count++;
                }

                while((j-l+1) - count > k){
                    if(s.charAt(l) == c){
                        count--;
                    }
                    l++;
                }
                res = Math.max(res, j-l+1);
            }
        }
        return res;
    }
}
