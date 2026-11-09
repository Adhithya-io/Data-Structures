class Solution {
    public boolean searchMatrix(int[][] a, int t) {
        int start = 0;
        int end = a[0].length-1;
        while(start<=a.length-1 && end>=0){
            int ans = a[start][end];
            if(ans == t){
                return true;
            }
            else if(ans<t){
                start++;
            }
            else{
                end--;
            }
        }
        return false;
    }
}
