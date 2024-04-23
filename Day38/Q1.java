import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}

public class Q1 {
    int sum_dfs(TreeNode root){
        if(root == null)return 0;
        if(root.left == null && root.right == null){
            return root.val;
        }
        int ans1 = sum_dfs(root.left);
        int ans2 = sum_dfs(root.right);
        return ans1+ans2;
    }

    int sum_bfs(TreeNode root){
        int sum = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode f = q.poll();
            if(f.left == null && f.right == null){
                sum+=f.val;
                continue;
            }
            if(f.left != null)q.add(f.left);
            if(f.right != null)q.add(f.right);
        }
        return sum;
    }

}
