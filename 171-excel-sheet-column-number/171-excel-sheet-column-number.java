class Solution {
    public int titleToNumber(String columnTitle) {
        if(columnTitle == null) return -1;
        
        int sum=0;
        for(char c : columnTitle.toCharArray()){
            sum*=26;
            sum+=c-'A'+1;
        }
        
        return sum;
        
    }
}