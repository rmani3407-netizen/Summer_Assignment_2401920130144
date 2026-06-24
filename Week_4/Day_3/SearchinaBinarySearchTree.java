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

public class SearchinaBinarySearchTree {
    public  TreeNode searchBST(TreeNode root, int val){
        while(root!=null){
            if(root.val==val){
                return root;
            }
            else if(val<root.val){
                root=root.left;
            }

            else{
                root=root.right;
            }
        }
        return null;
    }
    
}
