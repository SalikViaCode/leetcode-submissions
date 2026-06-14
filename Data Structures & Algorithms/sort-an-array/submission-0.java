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
    public void merge(int[] arr, int l, int m, int r){
        ArrayList<Integer> temp = new ArrayList<>();
        int i = l;
        int j = m+1;
        while(i <= m && j <= r){
            if(arr[i] <= arr[j])    temp.add(arr[i++]);
            else temp.add(arr[j++]);
        }
        while(i <= m)   temp.add(arr[i++]);
        while(j <= r)   temp.add(arr[j++]);
        for(i = l; i <= r; i++){
            arr[i] = temp.get(i-l);
        }
    }
}