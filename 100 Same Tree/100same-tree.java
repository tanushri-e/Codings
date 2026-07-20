/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> pl=new ArrayList<>();
        List<Integer> ql=new ArrayList<>();
        preorder(p,pl);
        preorder(q,ql);
        return pl.equals(ql);
    }
    public void preorder(TreeNode root,List<Integer> list){
            if(root==null) {
                list.add(null);
                return;
            }
            list.add(root.val);
            preorder(root.left,list);
            preorder(root.right,list);
    }
}