class Solution {
    
    private int getSumOfSquares(int n){
        int sum=0;
        while( n!=0 ){
            int d = n%10;
            n=n/10;
            sum+=d*d;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        
        Set<Integer> seen = new HashSet<Integer>();
        
        while( n!=1 && !seen.contains(n)){
            seen.add(n);
            n= getSumOfSquares(n);
        }
        
        return n==1;
        
        
    }
}