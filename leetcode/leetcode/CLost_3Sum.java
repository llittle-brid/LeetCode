import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by DELL on 2017/8/18.
 *
 * @author MJY
 */
public class CLost_3Sum {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int temp = nums[0] + nums[1] + nums[2], sum;
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1, right = nums.length - 1;
            while (right > left) {
                sum = nums[i] + nums[left] + nums[right];
                if (sum < target)
                    left++;
                if (sum > target)
                    right--;
                if (sum == target) {
                    return sum;
                }
                if (Math.abs(temp - target) > Math.abs(sum - target)) {//优选
                    temp = sum;
                    if (temp == target) break;
                }
            }
        }
        return temp;
    }
}
