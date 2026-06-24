package Week_4.Day_3;
import java.util.*;

import javax.swing.tree.TreeCellEditor;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
public class ValidateBinarySearchTree {
    public boolean isValid(TreeNode root){
        return validate(root,Long.MIN_VALUE,Long.MIN_VALUE);
    }
    private boolean validate(TreeNode root,long min ,long max){
        if(root==null){
            return true;
        }
        if(root.val<=min || root.val>=max){
            return false;
        }
         return validate(root.left, min, root.val) &&
               validate(root.right, root.val, max);
    }
}
