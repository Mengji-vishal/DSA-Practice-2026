class Solution {
    public int divisor(int n){
       int cnt=0;
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
                sum+=i;
            }if(cnt>4){
                return 0;
            }
        }
        if(cnt==4){
        return sum;
        }else{
            return 0;
        }
    }
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            ans+=divisor(n);
        }
        return ans;
    }
}