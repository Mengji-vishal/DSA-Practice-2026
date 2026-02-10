class Solution {
    public String removeStars(String s) {
        Stack<Character>st=new Stack<>();
        for(char num:s.toCharArray()){
            if(num!='*'){
                st.push(num);
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }
            }
        }
        StringBuilder sb=new StringBuilder("");
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}