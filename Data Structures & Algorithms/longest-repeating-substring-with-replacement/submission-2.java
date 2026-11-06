class Solution {
    public int characterReplacement(String s, int k) {
        int[] charcount = new int[26];
        int maxOcc = 0;
        int left = 0;
        int ans = 0;
        for(int i=0;i<s.length();i++){
            charcount[s.charAt(i)-'A']++;
            maxOcc = Math.max(maxOcc,charcount[s.charAt(i)-'A']);
            while((i-left+1)-maxOcc > k){
                charcount[s.charAt(left)-'A']--;
                left++;
            }
            ans = Math.max(ans,(i-left+1));
        }
        return ans;
    }
}
