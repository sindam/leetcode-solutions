class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftSum=0,sum=0;
        for(int x:nums )
            sum+=x;
        for(int i=0;i<nums.length;i++){
            if(leftSum == sum-leftSum-nums[i])
                return i;
            leftSum+=nums[i];
        }
        return -1;
        
    }
}