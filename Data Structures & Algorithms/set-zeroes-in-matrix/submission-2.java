class Solution {
    public void setZeroes(int[][] a) {
       int col0 = 1;
       for(int i=0;i<a.length;i++){
        if(a[i][0] == 0) {
            col0 = 0;
        }
        for(int j=1;j<a[i].length;j++){
            if(a[i][j] == 0){
                a[i][0] = 0;
                a[0][j] = 0;
            }
        }
       }
       

       for(int i = a.length - 1; i >= 0; i--){
            for(int j = a[i].length - 1; j >= 1; j--){
                if(a[i][0] == 0 || a[0][j] == 0){
                    a[i][j] = 0;
                }
        }
        if(col0 == 0){
            a[i][0] = 0;
        }
       }

    }
}
