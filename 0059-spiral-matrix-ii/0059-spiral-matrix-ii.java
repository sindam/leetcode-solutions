class Solution {
    public int[][] generateMatrix(int n) {
        
        int totalElements = n*n;
        int[][] result = new int[n][n];
        
        int colBegin = 0;
        int colEnd = n-1;
        int rowBegin = 0;
        int rowEnd = n-1;
        
        int element = 1;
        while( rowBegin <= rowEnd && colBegin <= colEnd && element <= totalElements){
            
            //right
            for(int i=colBegin;i<=colEnd;i++){
                result[rowBegin][i]=element;
                element++;
            }
            rowBegin++;
            
            //bottom
            for(int i=rowBegin;i<=rowEnd;i++){
                result[i][colEnd]=element;
                element++;
            }
            colEnd--;
            
            //left
            if(rowBegin <= rowEnd){
            for(int i=colEnd;i>=colBegin;i--){
                result[rowEnd][i]=element;
                element++;
            }
            }
            rowEnd--;
            
            //top
            if(colBegin <= colEnd){
            for(int i=rowEnd;i>=rowBegin;i--){
                result[i][colBegin]=element;
                element++;
            }
            }
            colBegin++;
            
        }
        
        return result;
        
    }
}