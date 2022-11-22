class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
       
        backTrack(result, new ArrayList<>(), nums);
        
        return result;
    }
    
    private void  backTrack(List<List<Integer>> result, List<Integer> tempList, int[] nums){
        
        if(tempList.size()== nums.length){
            
            result.add(new ArrayList<>(tempList));
            return;
            
        }
        
        for(int num : nums){
            
            if(!tempList.contains(num)){
            
            tempList.add(num);
            
            backTrack(result,tempList,nums);
            
            tempList.remove(tempList.size()-1);
           
            }
            
        }
    }
    
}