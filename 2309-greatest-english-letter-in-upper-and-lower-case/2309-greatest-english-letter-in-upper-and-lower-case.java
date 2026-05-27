class Solution {
    public String greatestLetter(String s) {
        Set<Character>mpp1=new HashSet<>();
        Set<Character>mpp2=new HashSet<>();
       for(char num:s.toCharArray()){
        if(num>='a'&&num<='z'){
            mpp1.add(num);
        }else{
            mpp2.add(num);
        }

       }
       StringBuilder sb=new StringBuilder();
       for(char i='Z';i>='A';i--){
        if(mpp1.contains(Character.toLowerCase(i))&&mpp2.contains(i)){
            sb.append(i);
            break;
        }
       }
       return sb.toString();
    }
}