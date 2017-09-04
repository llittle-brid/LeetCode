/**
 * Created by DELL on 2017/8/13.
 *
 * @author MJY
 */
public class Remove_Duplicates_from_Sorted_Array {
    /**
     * nums逐位比较，另一种解法，记录第一个出现的数字，Nums再和第一个出现的数字比较
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if(nums.length<2)return nums.length;
        int time = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1])
            {
                nums[time]=nums[i];
                time++;
            }
        }
        return time;
    }

    public static void main(String[] args) {
        System.out.println(new Remove_Duplicates_from_Sorted_Array().removeDuplicates(new int[]{1, 1, 2}));
    }
}
