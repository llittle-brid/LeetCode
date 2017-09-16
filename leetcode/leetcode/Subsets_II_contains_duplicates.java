import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by DELL on 2017/9/16.
 *
 * @author MJY
 */
public class Subsets_II_contains_duplicates {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(lists,new ArrayList<>(),nums,0);
        return lists;
    }

    private static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            if(i>start&&nums[i]==nums[i-1])continue;//跳过除了第一个以外的重复元素
            tempList.add(nums[i]);
            backtrack(list,tempList,nums,i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}
