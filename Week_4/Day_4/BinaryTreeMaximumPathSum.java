package Week_4.Day_4;
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

public class BinaryTreeMaximumPathSum {
    
    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftGain = Math.max(0, dfs(node.left));
        int rightGain = Math.max(0, dfs(node.right));

        // Path passing through current node
        int currentPathSum = node.val + leftGain + rightGain;

        // Update global maximum
        maxSum = Math.max(maxSum, currentPathSum);

        // Return max gain to parent
        return node.val + Math.max(leftGain, rightGain);
    }
}