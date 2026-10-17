class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)return null;
        TreeNode l = root.left;
        TreeNode r = root.right;
        root.left = invertTree(r);
        root.right = invertTree(l);
        return root;
    }
}
