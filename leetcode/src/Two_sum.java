import java.util.HashMap;
import java.util.Map;

/**
 * Created by DELL on 2017/8/12.
 *
 * @author MJY
 */
public class Two_sum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hash=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(hash.containsKey(target-nums[i]))
            {
                result[1]=i;
                result[0]=hash.get(target-nums[i]);
            break;
            }
            else{
                hash.put(nums[i],i);
        }
        }
        return  result;
    }
}
