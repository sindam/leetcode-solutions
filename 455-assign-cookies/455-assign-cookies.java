class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        //children and greed factors
        Arrays.sort(g);
        //children and size of biscuits
        Arrays.sort(s);
        
        int i=0;
        
        //looping over biscuits
        for(int j=0;i<g.length && j<s.length;j++){
            // finding user with greediness just lesser than equal to biscuit sizes
            if( g[i] <= s[j]){ 
                i++;
            }
        }
        
        return i;
        
    }
}