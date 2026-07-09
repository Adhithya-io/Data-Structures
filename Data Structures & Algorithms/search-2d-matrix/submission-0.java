class Solution {
    public boolean searchMatrix(int[][] matrix, int t) {
        int r_start = 0;
        int r_end = matrix.length-1;
        int c_start = 0;
        int c_end = matrix[0].length-1;
        if(matrix[0][0] > t || matrix[r_end][c_end]<t)
        {
                return false;
        }
        while(r_start <= r_end && c_end >=0){
            
            if(matrix[r_start][c_end] == t){
                return true;
            }
            else if(matrix[r_start][c_end] < t){
                r_start++;
            }
            else {
                c_end--;
            }
        }
        return false;
    }
}
