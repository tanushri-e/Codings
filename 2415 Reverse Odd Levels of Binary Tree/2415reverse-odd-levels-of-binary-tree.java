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
    public TreeNode reverseOddLevels(TreeNode root) 
    {
        int level=0;

        if(root==null)return null;

        Queue<TreeNode>q=new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty())
        {
            int size=q.size();

            List<TreeNode>currentLevel=new ArrayList<>();

            for(int i=0;i<size;i++)
            {
            TreeNode current=q.poll();
            currentLevel.add(current);
            
            if(current.left!=null)
                q.offer(current.left);

            if(current.right!=null)
                q.offer(current.right);
            }

            if(level%2!=0)
            {
                int left=0,right=currentLevel.size()-1;

                while(left<right)
                {
                    int temp=currentLevel.get(left).val;
                    currentLevel.get(left).val=currentLevel.get(right).val;
                    currentLevel.get(right).val=temp;
                    left++;
                    right--;
                }
            }
            level++;
        }
        return root;
    }
}
