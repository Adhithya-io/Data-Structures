class Solution {
    public static int peak(int[] a){
        int start = 0;
        int end = a.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(a[start]<=a[mid]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        int index = peak(nums);
        if(index == nums.length-1){
            return nums[0];
        }
        return nums[index];
    }
}
