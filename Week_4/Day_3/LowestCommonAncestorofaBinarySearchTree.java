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

public class LowestCommonAncestorofaBinarySearchTree {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
     while(root!=null){
        if(p.val<root.val&& q.val<root.val){
            root=root.left;
        }
         else if(p.val>root.val&& q.val>root.val){
            root=root.right;
        }
        else{
            return root;
        }
     }  
     return null; 
    }
}
