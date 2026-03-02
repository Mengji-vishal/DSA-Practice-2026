class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        
        for (char num : s.toCharArray()) {
            if (!st.isEmpty() && Math.abs(st.peek() - num) == 32) {
                st.pop();
            } else {
                st.push(num);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}