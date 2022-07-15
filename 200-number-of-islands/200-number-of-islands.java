class Solution {
    public int numIslands(char[][] grid) {
        
        int numOfIslands = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j < grid[i].length;j++){
                if( grid[i][j]=='1'){
                    numOfIslands++;
                    checkForIslands(grid,i,j);
                }
            }
        }
        
        return numOfIslands;  
    }
    
    private void checkForIslands(char[][] grid,int i,int j){
        
        if(i<0 || i >= grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0'){
            return;
        }
        
        grid[i][j]='0';
        checkForIslands(grid, i-1,j);
        checkForIslands(grid, i+1,j);
        checkForIslands(grid, i,j-1);
        checkForIslands(grid, i,j+1);

    }
}