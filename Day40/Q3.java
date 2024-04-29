package Day40;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}

public class Q3 {
    boolean pathSum(TreeNode root,int val){
        if(root == null || val < 0)return false;
        if(root.right == null && root.left == null){
            return root.val == val;
        }
        boolean ans1 = pathSum(root.left,val - root.val);
        boolean ans2 = pathSum(root.right , val - root.val);
        return ans1 || ans2;
    }
}
