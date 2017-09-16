import java.util.LinkedList;
import java.util.List;

/**
 * Created by DELL on 2017/9/16.
 *
 * @author MJY
 */
public class 树的子结构 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
        public boolean HasSubtree(TreeNode root1, TreeNode root2) {
            if(root1==null||root2==null)	return false;
            else return isSubtree(root1,root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
        }
        public static  boolean isSubtree(TreeNode root1,TreeNode root2) {
            if (root1==null&&root2!=null)return false;
            if(root2==null) return true;
            if(root1.val==root2.val)
                return isSubtree(root1.left,root2.left)&&isSubtree(root1.right, root2.right);
            else return false;

        }
    }
}
