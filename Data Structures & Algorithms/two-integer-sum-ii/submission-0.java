class Solution {
    public int[] twoSum(int[] a, int t) {

        int left = 0;
        int right = a.length-1;
        int sum = 0;
        while(left<right){
            sum = a[left]+a[right];
            if(sum == t){
                return new int[] {left+1,right+1};
            }
            else if(sum < t){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[] {-1,-1};
    }
}
