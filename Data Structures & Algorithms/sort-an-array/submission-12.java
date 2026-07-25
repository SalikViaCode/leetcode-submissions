class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        mergeSort(nums, 0, n-1);
        return nums;
    }
    public void mergeSort(int[] nums, int l, int r){
        if(l == r)  return;
        int m = (l+r)/2;
        mergeSort(nums, l, m);
        mergeSort(nums, m+1, r);
        merge(nums, l, m, r);
    }
    public void merge(int[] nums, int l, int m, int r){
        ArrayList<Integer> arr = new ArrayList<>();
        int i = l;
        int j = m+1;
        while(i <= m && j <= r){
            if(nums[i] <= nums[j])  arr.add(nums[i++]);
            else arr.add(nums[j++]);
        }
        while(i <= m)   arr.add(nums[i++]);
        while(j <= r)   arr.add(nums[j++]);
        for(i = l; i <= r; i++){
            nums[i] = arr.get(i-l);
        }
    }
}