class Solution {
    public int minOperations(int[] nums) {
        Set<Integer>mpp=new HashSet<>();
        int ans=0;
        for(int i=nums.length-1;i>=0;i--){
            int newEle=nums[i];
            if(mpp.contains(newEle)){
                ans=(i+1+3-1)/3;
                break;
            }else{
                mpp.add(newEle);
            }
        }
        return ans;
    }
}