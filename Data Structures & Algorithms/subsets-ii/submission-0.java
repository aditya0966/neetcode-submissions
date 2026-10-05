class Solution {

    private void valid(int stt,int[] nums,List<List<Integer>> ans,List<Integer> st){

        ans.add(new ArrayList<>(st));

        for(int i = stt;i < nums.length;i++){
            if(i > stt && nums[i] == nums[i-1]){
                continue;
            }
            st.add(nums[i]);
            valid(i+1,nums,ans,st);
            st.remove(st.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> ans  = new ArrayList<>();
        valid(0,nums,ans,new ArrayList<>());
        return ans;
    }
}
