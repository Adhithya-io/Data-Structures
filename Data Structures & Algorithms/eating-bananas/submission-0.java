class Solution {
    public boolean koko(int[] a,int mid,int h){
            int ans = 0;
            for(int i:a){
                ans = ans+ (int)Math.ceil((double)i/mid);
            }
            if(ans<=h){
                return true;
            }
            return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
            int l = 1;
            
            Arrays.sort(piles);
            int r = piles[piles.length-1];
            int ans = piles[piles.length-1];
            while(l<=r)   {
                int mid = l+(r-l)/2;
                if(koko(piles,mid,h)){
                    ans = Math.min(ans,mid);
                    r = mid-1;
                }
                else {
                   
                        l = mid+1;
                    
                }
            }
            return ans;
    }
}
