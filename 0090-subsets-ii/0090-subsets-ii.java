class Solution {
    public void print(int ind,int arr[],List<List<Integer>>ans,ArrayList<Integer>ls){
            ans.add(new ArrayList<>(ls));
        for(int i=ind;i<arr.length;i++){
            if(i>ind&&arr[i-1]==arr[i]) continue;
            ls.add(arr[i]);
            print(i+1,arr,ans,ls);
            ls.remove(ls.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>>ans=new ArrayList<>();
        print(0,nums,ans,new ArrayList<>());
        return ans;
    }
}