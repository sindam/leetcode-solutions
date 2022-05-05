class Solution {
    public boolean lemonadeChange(int[] bills) {
        int numOf5=0,numOf10=0,numOf20=0;
        for(int note: bills){
            
            if(note==5){
                numOf5++;
            }else if(note==10){
                numOf10++;
                if(numOf5>0){ 
                    numOf5--;
                }else{
                    return false;
                }
            }else{
                numOf20++;
                if(numOf10>0 && numOf5>0){
                    numOf5--;
                    numOf10--;
                }else if(numOf5>2){
                    numOf5=numOf5-3;
                }else{
                    return false;
                }
            }
        }
        return true;
        
    }
}