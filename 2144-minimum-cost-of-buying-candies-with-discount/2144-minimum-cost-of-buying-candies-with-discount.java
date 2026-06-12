class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int cnt=1;
        int sum=0;
        for(int i=cost.length-1;i>=0;i--){
            if(cnt%3!=0){
                sum+=cost[i];
                cnt++;
            }else{
                cnt=1;
            }
        }
        return sum;
    }
}