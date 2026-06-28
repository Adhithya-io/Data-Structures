class Solution {
    public static int peak(int[] a){
        int start = 0;
        int end = a.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(a[mid]>a[end]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
    public int findMin(int[] nums) {

        int index = peak(nums);
        
        return nums[index];
    }
}
