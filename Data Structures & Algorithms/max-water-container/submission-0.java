class Solution {
    public int maxArea(int[] a) {
        int left = 0;
        int right = a.length-1;
        int max = Integer.MIN_VALUE;
        while(left<right){
             max = Math.max(max,Math.min(a[left],a[right])*(right-left));
            if(a[left]<a[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max == Integer.MIN_VALUE?0:max;
    }
}
