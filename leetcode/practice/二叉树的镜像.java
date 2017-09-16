/**
 * Created by DELL on 2017/9/16.
 *
 * @author MJY
 */
public class 二叉树的镜像 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    public void Mirror(TreeNode root) {
            if (root==null)return;
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            Mirror(root.left);
            Mirror(root.right);
    }
    }
}
