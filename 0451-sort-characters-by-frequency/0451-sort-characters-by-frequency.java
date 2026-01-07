class Solution {
    public String frequencySort(String s) {
        StringBuilder sb=new StringBuilder("");
        int arr[]=new int[128];
        for(int num:s.toCharArray()){
            arr[num]++;
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        while(max>0){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==max){
                    char ch=(char)i;
                    for(int k=0;k<max;k++){
                        sb.append(ch);
                    }
                }
            }
            max--;
        }
        return sb.toString();
    }
}