/**
 * Created by DELL on 2017/9/10.
 *
 * @author MJY
 */
public class Search_for_a_Range {

    /**
     * 二分找到第一个大于等于target的数
     * @param nums
     * @param target
     * @return
     */
    public  int getRes(int[] nums,int target) {
        int low = 0, high = nums.length - 1, mid;
        System.out.println(high);
        while (low < high) {
            mid = (low + high) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
                continue;
            } else {
                high = mid;
            }
        } return low;
    }
    public  int[] searchRange(int[] nums, int target) {
            if (nums==null||nums.length==0)
            {
                return new int[]{-1,-1};
            }
            int start=getRes(nums,target);
            if(start==nums.length-1||nums[start]!=target)
            {
                return new int[]{-1,-1};
            }
            return new int[]{start,getRes(nums,target+1)-1};
        }

}
