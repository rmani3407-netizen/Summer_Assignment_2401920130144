package Week_4.Day_2;
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

public class BinaryTreeInorderTraversal {
    public List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> result= new ArrayList<>();
        inOrder(root,result);
        return result;
    }
    public void inOrder(TreeNode root,List<Integer> result){
        if(root== null){
            return;
        }
        inOrder(root.left, result);
        result.add(root.val);
        inOrder(root.right, result);
    }
    
}
