/**
 * Created by DELL on 2017/9/11.
 *
 * @author MJY
 */

/**
 * 已知前序，中序 重建二叉树
 */
public class 重建二叉树 {
    public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x) { val = x; }
        }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode res=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return  res;
    }
    public  TreeNode reConstructBinaryTree(int[] pre,int preStart,int preEnd,int[] in,int inStart,int inEnd){
        if(preStart>preEnd||inStart>inEnd) return null;
        TreeNode root=new TreeNode(pre[preStart]);
        for (int i = 0; i < in.length; i++) {
            if (pre[preStart]==in[i]){
                root.left=reConstructBinaryTree(pre,preStart+1,preStart+i-inStart,in,inStart,i-1);
                root.right=reConstructBinaryTree(pre,preStart+i-inStart+1,preEnd,in,i+1,inEnd);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        重建二叉树 a=new 重建二叉树();
        a.reConstructBinaryTree(new int[]{1,2,4,7,3,5,6,8},new int[]{4,7,2,1,5,3,8,6});
    }
}
