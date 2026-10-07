class Solution {

    private void valid(int i,int[] candidates,int target,List<List<Integer>> ans,List<Integer> st){

        if(i == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(st));
            }
            return;
        }

        if(candidates[i] <= target){
            st.add(candidates[i]);
            valid(i,candidates,target - candidates[i],ans,st);
            st.remove(st.size() - 1);
        }

        valid(i+1,candidates,target,ans,st);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        valid(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}