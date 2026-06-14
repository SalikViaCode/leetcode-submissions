class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int l = 0;
        int r = n-1;
        while(l < r){
            while(l < r && !alphaNum(s.charAt(l))){
                l++;
            }
            while(r > l && !alphaNum(s.charAt(r))){
                r--;
            }
            while(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean alphaNum(char a){
        return (a >= 'A' && a <= 'Z' || a >= 'a' && a <= 'z' || a >= '0' && a <= '9');
    }
}
