package Day41;
/*
 * given root of a BT , return true if the left and the right subtree are identical
 * or not
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}

public class Q2 {

    boolean pre(TreeNode r1, TreeNode r2){
        if(r1 == null || r2 == null)return r1 == r2;
        if(r1.val != r2.val)return false;
        boolean ans1 = pre(r1.left,r2.left);
        boolean ans2 = pre(r1.right , r2.right);
        return ans1 && ans2;
    }

    boolean isSame(TreeNode root){
        if(root == null)return true;
        return pre(root.left,root.right);
    }
}
