import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by DELL on 2017/9/14.
 *
 * @author MJY
 */
public class 从下往上打印二叉树 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;
        queue.add(root);
        TreeNode nowNode;
        while (!queue.isEmpty()) {
            nowNode = queue.remove();
            res.add(nowNode.val);
            if (nowNode.left != null) queue.add(nowNode.left);
            if (nowNode.right != null) queue.add(nowNode.right);
        }
        return res;
    }
}
