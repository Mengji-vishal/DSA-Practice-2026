class Solution {
    public long maxStrength(int[] nums) {
        long sum=1;
        Arrays.sort(nums);
        int cnt=0;
        boolean flag=false;
        if(nums.length==1){
            sum*=nums[0];
            return sum;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                cnt++;
            }else{
                break;
            }
        }
        if(cnt%2!=0){
            cnt=cnt-1;
        }
        for(int i=0;i<cnt;i++){
            sum*=nums[i];
            flag=true;
            
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                sum*=nums[i];
                flag=true;
            }
        }
        if(!flag){
            return 0;
        }
        return sum;
    }
}