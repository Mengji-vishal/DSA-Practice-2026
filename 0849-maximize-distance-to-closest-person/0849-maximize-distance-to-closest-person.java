class Solution {
    public int maxDistToClosest(int[] seats) {
        int max=0;
        int lp=-1;
        for(int i=0;i<seats.length;i++){
            if(seats[i]==1){
            if(lp==-1){
            max=i;
            }else{
                max=Math.max(max,(i-lp)/2);
            }
            lp=i;
            }
        }
        max=Math.max(max,seats.length-1-lp);
        return max;
    }
}