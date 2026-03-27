class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int check=0;
        for(int i=0;i<nums.length;i++){
            if(mpp.containsKey(nums[i])){
                check=Math.abs(mpp.get(nums[i])-i);
                if(check<=k){
                    return true;
                }

            }
            mpp.put(nums[i],i);
            
        }
        return false;
    }
}