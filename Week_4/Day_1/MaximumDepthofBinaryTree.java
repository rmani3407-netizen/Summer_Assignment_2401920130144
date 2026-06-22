package Week_4.Day_1;
import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+ Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    
}
