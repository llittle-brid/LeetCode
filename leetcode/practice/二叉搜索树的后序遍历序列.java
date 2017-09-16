/**
 * Created by DELL on 2017/9/14.
 *
 * @author MJY
 */
public class 二叉搜索树的后序遍历序列 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null && sequence.length == 0) return false;
        return judge(sequence, 0, sequence.length - 1);
    }

    public boolean judge(int[] sequence, int left, int right) {
        if (right <=left) return true;
        int temp = left;
        while (sequence[temp] < sequence[right]) temp++;
        for (int i = temp; i < right-1; i++) if (sequence[i] > sequence[right]) return false;
        return judge(sequence, left, temp - 1) && judge(sequence, temp, right);
    }
}
