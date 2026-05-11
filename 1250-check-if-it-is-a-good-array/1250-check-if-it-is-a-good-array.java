class Solution {
    public int gcd(int a,int b){
        while(a>0&&b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        if(a==0) return b;
        return a;
    }
    public boolean isGoodArray(int[] nums) {
        int curGcd=nums[0];
        for(int i=1;i<nums.length;i++){
            curGcd=gcd(curGcd,nums[i]);
        }
        if(curGcd==1){
            return true;
        }
        return false;
    }
}