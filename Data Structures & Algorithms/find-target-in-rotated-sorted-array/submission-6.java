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
    public int binary(int[] a,int s,int e,int t){
        int start = s;
        int end = e;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(a[mid] == t){
                return mid;
            }
            else if(a[mid] < t){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int index = peak(nums);
        if(index == -1){
            return binary(nums,0,nums.length-1,target);
        }
        if(nums[index] == target){
            return index;
        }
        int first = binary(nums,0,index-1,target);
        if(first!=-1){
            return first;
        }
        return binary(nums,index+1,nums.length-1,target);
    }
}
