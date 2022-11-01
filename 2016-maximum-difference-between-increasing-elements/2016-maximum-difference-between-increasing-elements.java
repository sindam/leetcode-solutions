class Solution {
    public int maximumDifference(int[] nums) {
        int maxDifference = 0;
        int minSoFar=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] < minSoFar)
                minSoFar=nums[i];
            maxDifference = Math.max(maxDifference, nums[i]-minSoFar);
        }
        if(maxDifference == 0){
            return -1;
        }else{
            return maxDifference;
        }
    }
}