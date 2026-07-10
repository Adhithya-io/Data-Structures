class Solution {
    int helper(int[] a){
        int rob1 = 0;
        int rob2 = 0;
        for(int n:a){
            int temp = Math.max(rob1+n , rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;

    }
    public int rob(int[] nums) {
        int[] skip1 = new int[nums.length-1];
        int[] skiplast = new int[nums.length-1];
        if(nums.length<2){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i++){
            skiplast[i] = nums[i];
            skip1[i] = nums[i+1];
        }
        return Math.max(helper(skip1),helper(skiplast));
    }
}
