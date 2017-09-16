/**
 * Created by DELL on 2017/9/10.
 *
 * @author MJY
 */
public class Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target==nums[i])return i;
        }
        return -1;
    }
}
