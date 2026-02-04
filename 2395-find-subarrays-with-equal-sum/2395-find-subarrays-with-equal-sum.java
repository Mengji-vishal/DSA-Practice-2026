class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer>mpp=new HashSet<>();
        for(int i=1;i<nums.length;i++){
            int sum=nums[i-1]+nums[i];
            if(mpp.contains(sum)){
                return true;
            }
            mpp.add(sum);
        }
        return false;
    }
}