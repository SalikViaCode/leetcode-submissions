class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        while(i < n){
            nums1[i+m] = nums2[i];
            i++;
        }
        Arrays.sort(nums1);
    }
}