class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if(target>x+y){
            return false;
        }
        while(x>0&&y>0){
            if(x>y) x=x%y;
            else y=y%x;
        }
        if(x==0){
            if(target%y==0){
                return true;
            }
        }else{
            if(target%x==0){
                return true;
            }
        }
        return false;
    }
}