class Solution {
    public int reverseDegree(String s) {
        int cnt=0;
        int i=1;
        for(int num:s.toCharArray()){
           int val='z'-num+1;
            cnt+=val*i;
            i++;
        }
        return cnt;
    }
}