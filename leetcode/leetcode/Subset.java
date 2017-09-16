import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by DELL on 2017/9/11.
 *
 * @author MJY
 */
public class Subset {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(lists,new ArrayList<>(),nums,0);
        return lists;
    }

    private static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
            list.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(list,tempList,nums,i+1);
            list.remove(tempList.size()-1);
        }
    }

    public static void main(String[] args) {
    }
}
