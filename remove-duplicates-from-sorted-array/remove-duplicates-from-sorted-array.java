class Solution {
    public int removeDuplicates(int[] nums) {
        
        int uniquePointer = 0;
        for(int i=0; i< nums.length ; i++){
            if(nums[i] != nums[uniquePointer]){
                nums[++uniquePointer]=nums[i];
            } 
        }
        return ++uniquePointer;
    }
}