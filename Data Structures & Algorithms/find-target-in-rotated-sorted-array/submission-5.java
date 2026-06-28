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
    public static int binary(int[] a,int t,int s,int e){
        int start = s;
        int end = e;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(a[mid] == t){
                return mid;
            }
            else if(a[mid]<t){
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
        
        if(target == nums[index]){
            return index;
        }
        else if(target>=nums[index] && target<=nums[nums.length-1]){
            return binary(nums,target,index+1,nums.length-1);
        }
        return binary(nums,target,0,index-1);

    }
}
