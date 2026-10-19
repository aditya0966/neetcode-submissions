class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ans = new ArrayList<>();
        dfs(root,ans);
        Collections.sort(ans);
        return ans.get(k-1);
    }
    public void dfs(TreeNode root,List<Integer> ans ){
        if(root == null)return;
        ans.add(root.val);
        dfs(root.left,ans);
        dfs(root.right,ans);
    }
}
