class Solution {
    public void dfs(int i,int j,char[][] grid){
           int rows = grid.length-1;
        int cols = grid[0].length-1;
            if(i<0 || i>rows || j<0 || j>cols || grid[i][j]!='1'){
                return;
            }
            else {
            grid[i][j] = '0';
            dfs(i,j+1,grid);
            dfs(i+1,j,grid);
            dfs(i,j-1,grid);
            dfs(i-1,j,grid);
            }
        }
    public int numIslands(char[][] grid) {
     


        int res = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == '1'){
                    res+=1;
                    dfs(i,j,grid);
                }
            }
        }
        return res;
    }
}
