class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        
        Stack<Long>st=new Stack<>();
        for(int i=0;i<nums.length;i++){
            Long ele=(long)nums[i];
            while(!st.isEmpty()&&st.peek().equals(ele)){
                st.pop();
                ele=ele*2;
            }
            st.push(ele);
        }
        ArrayList<Long>ls=new ArrayList<>(st);
        return ls;
    }
}