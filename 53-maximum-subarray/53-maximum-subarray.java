class Solution {
    
    //Kadanes Algorithm
    public int maxSubArray(int[] nums) {
        
        int maxSoFar = Integer.MIN_VALUE;
        int maxTillHere = 0;
        
        for(int x:nums){
            maxTillHere = Math.max(x,maxTillHere + x);
            maxSoFar = Math.max(maxSoFar,maxTillHere);
        }
        
        return maxSoFar;
        
    }
}