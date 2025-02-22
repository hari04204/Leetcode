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
    public TreeNode recoverFromPreorder(String trav) {
        Stack<TreeNode> stack = new Stack<>();
        int i = 0;
        
        while (i < trav.length()) {
            int depth = 0;
            
            while (i < trav.length() && trav.charAt(i) == '-') {
                depth++;
                i++;
            }
            
            int num = 0;
            while (i < trav.length() && Character.isDigit(trav.charAt(i))) {
                num = num * 10 + (trav.charAt(i) - '0');
                i++;
            }
            
            TreeNode node = new TreeNode(num);
            
            if (depth == 0) {
                stack.push(node);
            } else {
                while (stack.size() > depth) {
                    stack.pop();
                }
                
                TreeNode parent = stack.peek();
                if (parent.left == null) {
                    parent.left = node;
                } else {
                    parent.right = node;
                }
                
                stack.push(node);
            }
        }
        
        while (stack.size() > 1) {
            stack.pop();
        }
        
        return stack.peek();
    }
}