package Week_4.Day_5;
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
public class ConstructBinaryTreefromPreorderandInorderTraversal {
    
   private int preorderIndex = 0;
    private Map<Integer, Integer> inorderMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        // Store inorder value -> index
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int left, int right) {

        // No nodes in this subtree
        if (left > right) {
            return null;
        }

        // Root is current preorder element
        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);

        // Find root position in inorder
        int inorderIndex = inorderMap.get(rootValue);

        // Build left subtree
        root.left = build(preorder, left, inorderIndex - 1);

        // Build right subtree
        root.right = build(preorder, inorderIndex + 1, right);

        return root;
    }
}