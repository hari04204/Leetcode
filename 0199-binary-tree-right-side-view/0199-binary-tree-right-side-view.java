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
// class Solution {
//     public List<Integer> rightSideView(TreeNode root) {
//         if(root==null) return new ArrayList<>();
//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root);
//         List<Integer> ans = new ArrayList();
//         while(!q.isEmpty()){
//             int s = q.size();
//             for(int i=0; i<s; i++){
//                 TreeNode node = q.remove();
//                 if(node.left!=null) q.add(node.left);
//                 if(node.right!=null) q.add(node.right);
//                 if(i==s-1){
//                     ans.add(node.val);
//                 }
//             }
//         }
//         return ans;
//     }
// }
class Solution{
    public List<Integer> rightSideView(TreeNode root){
        if(root==null) return new ArrayList<>();
        Set<Integer> levels = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        dfs(root,levels,0,ans);
        return ans;
    }
    public void dfs(TreeNode node, Set<Integer> levels, int lvl, List<Integer> ans){
        if(node==null) return;
        if(!levels.contains(lvl)){
            ans.add(node.val);
            levels.add(lvl);
        }
        dfs(node.right,levels,lvl+1,ans);
        dfs(node.left,levels,lvl+1,ans);
    }
}