class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        if(nums.length == 0){
            return 0;
        }
        
        int max = 1;
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i]-1)){
                continue;
            }
            int cur = nums[i];
            int len = 1;
            while(hs.contains(cur+1)){
                cur++;
                len++;
            }
            max = Math.max(max,len);
        }
        return max;
    }
}
