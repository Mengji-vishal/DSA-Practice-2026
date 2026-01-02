class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer>mpp=new HashSet<>();
        for(int num:nums){
            if(mpp.contains(num)){
                return num;
            }
            mpp.add(num);
        }
        return -1;
    }
}