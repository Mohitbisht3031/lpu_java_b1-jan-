package Day39;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}

/*
 * given a BT root we are supposed to return the sum of all the leaf node who are
 * also left child of there parent
 */

public class Q1 {

    int dfs(TreeNode root , boolean f){
        if(root == null)return 0;
        if(root.left == null && root.right == null){
            return (f == true ? root.val : 0);
        }
        return dfs(root.left, true) + dfs(root.right , false);
    }

    int sum(TreeNode root){
        if(root == null)return 0;
        return dfs(root,false);
    }
}
