class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
       
        Arrays.sort(nums);
        
        backTrack(result, new ArrayList<>(), nums , new boolean[nums.length]);
        
        return result;
    }
    
    private void  backTrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] used){
        
        if(tempList.size()== nums.length && !result.contains(tempList)){
            
            result.add(new ArrayList<>(tempList));
            
        } else{
        
             for(int i=0;i<nums.length; i++){
            
                  if(!used[i]){
                
                      used[i]=true;
                      tempList.add(nums[i]);
            
                      backTrack(result,tempList,nums,used);
            
                      used[i]=false;
                      tempList.remove(tempList.size()-1);
            
                  }
            
             }
        }
    }
    
}