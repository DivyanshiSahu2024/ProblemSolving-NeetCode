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
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean valid(TreeNode node, long leftNode, long rightNode){
        if(node==null) return true;

        if( !(leftNode < node.val && node.val<rightNode)) return false;

        return valid(node.left, leftNode, node.val) &&
               valid(node.right, node.val, rightNode);
    }
}
//    TreeNode temp=root;
    //    if(temp.left.val < temp.val && temp.right.val > temp.val) return true;
    //    if(temp.left.val > temp.val || temp.right.val < temp.val) return false;
    //    if(temp.left!=null) return isValidBST(temp.left);
    //    return true;