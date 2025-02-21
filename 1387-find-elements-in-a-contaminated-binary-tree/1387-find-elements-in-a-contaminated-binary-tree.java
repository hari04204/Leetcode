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
class FindElements {
    TreeNode root;
    Set<Integer> set;
    public FindElements(TreeNode node) {
        root = node;
        set=new HashSet<>();
        set.add(0);
        helper(root,set,0);
    }
    public void helper(TreeNode node, Set<Integer> set, int curr){
        if(node.left!= null){
            set.add(2*curr+1);
            helper(node.left,set,2*curr+1);
        }
        if(node.right!=null){
            set.add(2*curr+2);
            helper(node.right,set,2*curr+2);
        }
    }
    public boolean find(int target) {
        return set.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */