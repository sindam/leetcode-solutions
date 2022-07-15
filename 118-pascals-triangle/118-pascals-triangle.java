class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        List<Integer> firstRow = new ArrayList<>(1);
        firstRow.add(1);
        triangle.add(firstRow);
        
        for(int i=1;i<numRows;i++){
            List<Integer> prevList = triangle.get(i-1);
            List<Integer> currentList = new ArrayList<>();
            currentList.add(1);
            
            for(int j=1;j<i;j++){
                currentList.add(prevList.get(j-1)+prevList.get(j));
            }
            
            currentList.add(1);
            triangle.add(currentList);
            
        }
        return triangle;
        
    }
}