class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        int start = 1;
        int end = (int)(x/2);
        long res = 0;
        while(start<=end){
            int mid = start+(end-start)/2;
            res = (long) mid*mid;
            if(res == x){
                return mid;
            }
            else if(res < x){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return end;
    }
}