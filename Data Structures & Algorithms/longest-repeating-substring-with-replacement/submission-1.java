class Solution {
    public int characterReplacement(String s, int k) {
        int[] max_occ = new int[26];
        int left = 0;
        int max = Integer.MIN_VALUE;
        int maxocc = 0;

        for(int i=0;i<s.length();i++){
                        maxocc = Math.max(maxocc,++max_occ[s.charAt(i)-'A']);

            if(i-left+1-maxocc > k){
                max_occ[s.charAt(left)-'A']--;
                left++;
            }
            max = Math.max(max,(i-left+1));
        }
        return max;
    }
}
