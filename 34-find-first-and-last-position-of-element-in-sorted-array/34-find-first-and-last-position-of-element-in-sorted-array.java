class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] rangeArray = new int[]{-1,-1};
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
            if( rangeArray[0] == -1 && rangeArray[1] == -1){
                rangeArray[0] = i;
                rangeArray[1] = i;

            }else {
                rangeArray[1] = i;
            }
            } 
        }
        return rangeArray;

        }
}