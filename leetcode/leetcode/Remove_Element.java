/**
 * Created by DELL on 2017/8/14.
 *
 * @author MJY
 */
public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        int m=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[m]=nums[i];
                m++;
            }
        }return m;
    }

    public static void main(String[] args) {
        new Remove_Element().removeElement(new int[]{3,3,3},3);
    }
}
