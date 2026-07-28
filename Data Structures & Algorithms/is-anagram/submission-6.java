class Solution {
    public boolean isAnagram(String s1, String s2) {
		if(s1.length() != s2.length())	return false;
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i])	return false;
		}
		return true;
		
	}
}
