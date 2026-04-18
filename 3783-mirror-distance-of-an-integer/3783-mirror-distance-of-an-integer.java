class Solution {
    public int mirrorDistance(int n) {
        int num=n;
        int re=0;
        int mul=0;
        while(num>0){
            int digit=num%10;
            re=(re*10)+digit;
            num/=10;
        }
        return Math.abs(n-re);
    }
}