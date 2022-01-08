class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex=-1,m=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>m){
                m=nums[i];
                maxIndex=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=m && (nums[i]*2)>m){
                return -1;
            }
        }
        return maxIndex;
        
    }
}