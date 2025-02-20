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
    public int goodNodes(TreeNode root) {
        return dfs(root,0);
    }
    public int dfs(TreeNode node, int max){
        if(node==null) return 0;
        int count = 0;
        max = Math.max(node.val,max);
        if(node.val>=max) count++;
        count += dfs(node.left,max);
        count += dfs(node.right,max);
        return count;
    }
}