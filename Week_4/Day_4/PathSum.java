package Week_4.Day_4;
import java.util.*;
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


public class PathSum {
   public boolean hasPathSum (TreeNode root,int targetSum){
   if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            return targetSum==root.val;
        }
        return hasPathSum(root.left, targetSum - root.val) ||
               hasPathSum(root.right, targetSum - root.val);
        
    }
}