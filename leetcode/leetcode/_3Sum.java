import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by DELL on 2017/8/18.
 *
 * @author MJY
 */
public class _3Sum {
    /**
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<Integer> hash=new HashSet<>();
        List<List<Integer>> res=new ArrayList<>();
        sort(0,nums.length-1,nums);
        for (int i = 0; i < nums.length; i++) {
            if(i==0||(i>0&&nums[i]!=nums[i-1])){
                int left=i+1,right=nums.length-1,sum=0-nums[i];
                while (right>left)
                {
                    if(nums[left]+nums[right]==sum){
                        res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        while (right>left&&nums[left]==nums[left+1])left++;
                        while (right>left&&nums[right]==nums[right-1])right--;
                        left++;right--;
                    }
                    else if (nums[left]+nums[right]<sum)left++;
                    else right--;
                }
            }
        }
        return res;
    }

    public static void sort(int left, int right, int[] nums) {
        int temp, i = left, j = right,t;
        if (left >= right) return;
        temp = nums[left];
        while(i!=j)
        {
            while(nums[j]>=temp&&j>i)//j一直向左找比temp大的数字
            {
                j--;
            }
            while(nums[i]<=temp&&j>i)//i向右找比temp小的数字
            {
                i++;
            }
            if(j>i){
                t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;}
        }
        nums[left]=nums[i];
        nums[i]=temp;
        sort(left,i-1,nums);//i指针即为基数temp的所在位置
        sort(i+1,right,nums);
    }

    public static void main(String[] args) {
        _3Sum sum=new _3Sum();
        sum.threeSum(new  int[]{-1,0,1,2,-1,-4});
    }
}
