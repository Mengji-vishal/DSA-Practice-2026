class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ls=new ArrayList<>();
        int n=num.length-1;
        while(n>=0||k>0){
            if(n>=0){
                k+=num[n];
                n--;
            }
            ls.add(k%10);
            k/=10;
        }
        Collections.reverse(ls);
        return ls;
    }
}