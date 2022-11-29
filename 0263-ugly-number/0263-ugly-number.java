class Solution {
    public boolean isUgly(int n) {
        
        if(n <= 0){
            return false ;
        }
        
        for(int factor : new int[]{2,3,5}){
            n = isDivisibleByFactor(n,factor);
            if(n==1) return true;
        }
        
        return n==1;
        
    }
    
    private int isDivisibleByFactor(int dividend, int divisor){
        while(dividend % divisor == 0){
            dividend/=divisor;
        }
        return dividend;
    }
}