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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<TreeNode> lst = new ArrayList<>();
        lst.add(root);
        while(!lst.isEmpty()){
            List<Integer> arr = new ArrayList<>();
            List<TreeNode> lst2 = new ArrayList<>();
            for(TreeNode node: lst){
                if(node==null) continue;
                arr.add(node.val);
                lst2.add(node.left);
                lst2.add(node.right);
            }
            lst = lst2;
            if(!arr.isEmpty())ans.add(arr);
        }
        return ans;
    }
}