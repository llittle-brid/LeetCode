import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by DELL on 2017/9/14.
 *
 * @author MJY
 */
public class 二叉树中和为某一值的路径 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        if (root == null)
            dfs(root, root.val, target, paths, stack);
        return paths;
    }

    public void dfs(TreeNode root, int nowNum, int target, ArrayList<ArrayList<Integer>> paths, Stack<Integer> stack) {
        stack.push(root.val);
        nowNum += root.val;
        if (root.left == null && root.right == null) //叶子节点
        {
            if (nowNum == target) {//找的结果
                Object[] nums = stack.toArray();
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 0; i < nums.length; i++) {
                    list.add((Integer) nums[i]);
                }
                paths.add(list);
            }
        }
        if (root.left != null)
            dfs(root.left, nowNum, target, paths, stack);
        if (root.right != null)
            dfs(root.right, nowNum, target, paths, stack);
        stack.pop();
    }

}
