class Solution {
    
    public int[] findBall(int[][] grid) {
        
        int columns = grid[0].length;
        int[] ballPositions = new int[columns];
        
        for(int chosenBall=0;chosenBall<columns;chosenBall++){
            ballPositions[chosenBall] = getPositionOfBall(0,chosenBall, grid); 
        } 
        
        return ballPositions;
    }
    
    private int getPositionOfBall(int row, int column, int[][] grid){
        
        if(row == grid.length){
            return column;
        }
        int nextColumn = column+ grid[row][column];
        if(nextColumn < 0 || nextColumn > grid[0].length-1 || (grid[row][column] != grid[row][nextColumn])){
             return -1;
        }
        return getPositionOfBall(row+1,nextColumn,grid);
    }
    
}