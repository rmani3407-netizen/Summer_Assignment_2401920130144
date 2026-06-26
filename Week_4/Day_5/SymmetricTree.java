package Week_4.Day_5;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}

public class SymmetricTree {
    
   public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        // Both nodes are null
        if (left == null && right == null) {
            return true;
        }

        // One node is null or values are different
        if (left == null || right == null || left.val != right.val) {
            return false;
        }

        // Compare outer and inner children
        return isMirror(left.left, right.right) &&
               isMirror(left.right, right.left);
    }
}