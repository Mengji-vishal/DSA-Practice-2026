class Solution {
    public boolean validDigit(int n, int x) {
        String s=String.valueOf(n);
        String ss=String.valueOf(x);
        if(s.charAt(0)==ss.charAt(0)){
            return false;
        }
        for(char num:s.toCharArray()){
            if(num==ss.charAt(0)){
                return true;
            }
        }
        return false;
    }
}