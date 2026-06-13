class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder("");
        
        for(String s:words){
            int sum=0;
            for(char num:s.toCharArray()){
            int index=num-'a';
            sum+=weights[index];
            }
            sb.append((char)('z'-(sum%26)));
        }
        return sb.toString();
    }
}