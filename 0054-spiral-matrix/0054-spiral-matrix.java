class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList<Integer>();
        
        if(matrix.length == 0 || matrix[0].length <= 0)
            return result;
        
        int colBegin = 0;
        int colEnd = matrix[0].length-1;
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
            
        while( rowBegin <= rowEnd && colBegin <= colEnd){
            
            // move right
            for(int i=colBegin;i<=colEnd;i++){
                result.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            
            // move down
            for(int i=rowBegin;i<=rowEnd;i++){
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            //move left
            if(rowBegin <= rowEnd){
            for(int i=colEnd;i>=colBegin;i--){
                result.add(matrix[rowEnd][i]);
            }
            }
            rowEnd--;

            // move up
            if(colBegin <= colEnd){
             for(int i=rowEnd;i>=rowBegin;i--){
                result.add(matrix[i][colBegin]);
            }
            }
            colBegin++;

        }
        
        return result;

    }
}