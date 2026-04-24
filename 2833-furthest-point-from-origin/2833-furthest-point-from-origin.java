class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0;
        int r=0;
        int total=0;
        char check='R';
        for(char num:moves.toCharArray()){
            if(num=='R') r++;
            if(num=='L') l++;
        }
        if(r<l){
            check='L';
        }else if(l<r){
            check='R';
        }
        for(char num:moves.toCharArray()){
            if(check==num||num=='_'){
                total++;
        }else{
            total--;
        }
        }
        return total;
    }
}