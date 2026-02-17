class Solution {
    public int prefixConnected(String[] words, int k) {
        HashMap<String,Integer>mpp=new HashMap<>();
        for(String num:words){
            String s=num;
            if(s.length()>=k){
                String prefix=s.substring(0,k);
                mpp.put(prefix,mpp.getOrDefault(prefix,0)+1);
            }
        }
        int cnt=0;
        for(String num:mpp.keySet()){
            int feq=mpp.get(num);
            if(feq>=2){
                cnt++;
            }
        }
        return cnt;
    }
}