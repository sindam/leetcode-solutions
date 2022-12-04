class Solution {
    public void reverseString(char[] s) {
        int size = s.length;
        for (int i=0,j=size-1; i < j; i++,j--){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}