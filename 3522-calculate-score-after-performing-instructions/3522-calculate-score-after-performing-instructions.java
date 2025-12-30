class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        long sum=0;
        int n=values.length;
        String check="add";
        Set<Integer>mpp=new HashSet<>();
        for(int i=0;i<n;i++){
            if(mpp.contains(i)||i<0){
                break;
            }
            mpp.add(i);
            if(check.equals(instructions[i])){
                sum+=(long)values[i];
                System.out.print(sum);
                
            }else{
                i=i+values[i];
                i--;
            }
        }
        return sum;
    }
}