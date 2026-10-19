class Solution {  
    public boolean sametree(TreeNode root,TreeNode subroot){
        if(root == null && subroot == null)return true;
        if(root != null && subroot != null && root.val == subroot.val){
            return sametree(root.left,subroot.left) && sametree(root.right,subroot.right);
        }
        return false;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null)return true;
        if(root == null)return false;
        if(sametree(root,subRoot))return true;
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
}
