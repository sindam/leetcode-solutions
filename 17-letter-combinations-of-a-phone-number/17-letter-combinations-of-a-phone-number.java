class Solution {
   
    //At max of size 144
    public List<String> letterCombinations(String digits) {
        
        if(digits.isEmpty()){
            return new ArrayList<>();
        }

        List<String> mapping =
            new ArrayList<>(List.of("#","#","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"));

        LinkedList<String> result = new LinkedList<>();
        result.add("");
        for(int i=0; i<digits.length(); i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(result.peek().length()==i){
				String temp = result.remove();
				for(char s : mapping.get(x).toCharArray()) 
					result.add(temp+s);
			}
        }
       
        return result;
        
    }
}