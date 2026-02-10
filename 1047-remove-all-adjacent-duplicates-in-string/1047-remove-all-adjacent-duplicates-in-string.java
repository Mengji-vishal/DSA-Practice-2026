class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        for(char num:s.toCharArray()){
            if(st.isEmpty()){
                st.push(num);
            }else if(st.peek()==num){
                st.pop();
            }else{
                st.push(num);
            }
        }
        StringBuilder sb=new StringBuilder("");
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}