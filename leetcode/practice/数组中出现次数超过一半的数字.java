/**
 * Created by DELL on 2017/9/16.
 *
 * @author MJY
 */
public class 数组中出现次数超过一半的数字 {
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0) return 0;
        int count = 1, num = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) count++;
            else if (count > 0) {
                count--;
                if (count == 0) {
                    count = 1;
                    num = array[i];
                }

            }
        }
        if (count > 1) return num;
        else return 0;
    }
}
