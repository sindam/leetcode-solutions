class Solution {
    public int balancedStringSplit(String s) {
        int R=0,L=0,count=0;
        for(char c : s.toCharArray()){
            if(c == 'L') L++;
            else if(c == 'R') R++;
            if(L==R){
                count++;
                L=0;
                R=0;
            }
        }
        return count;
        
    }
}