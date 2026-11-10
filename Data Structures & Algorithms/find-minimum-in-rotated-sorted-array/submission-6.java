class Solution {
    public int peak(int[] a){
        int start = 0;
        int end = a.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && a[mid]>a[mid+1]){
                return mid;
            }
            else if(mid>start && a[mid-1]>a[mid]){
                return mid-1;
            }
            else if(a[start]<=a[mid]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return -1;
    }
    public int findMin(int[] nums) {
        int index = peak(nums);
        if(index == -1 || index == nums.length-1){
            return nums[0];
        }
        return nums[index+1];
    }
}
