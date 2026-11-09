class Solution {
    public boolean canDo(int val,int[] piles,int h){
        int ans = 0;
        for(int i:piles){
            ans += (i+val-1)/val;
        }
        return ans<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int max = 0;
        for(int i:piles)
        {
            max = Math.max(max,i);
        }
        int end =  max;
        while(start<end){
            int mid = start+(end-start)/2;
            if(canDo(mid,piles,h)){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
}
