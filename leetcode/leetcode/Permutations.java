import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2017/9/15.
 *
 * @author MJY
 */

/**
 * 全排列[1,2,3]数字不重复
 * [
 [1,2,3],
 [1,3,2],
 [2,1,3],
 [2,3,1],
 [3,1,2],
 [3,2,1]
 ]
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> list = new ArrayList<>();
            // Arrays.sort(nums); // not necessary
            backtrack(list, new ArrayList<>(), nums);
            return list;
        }

    private void backtrack(List<List<Integer>> list, ArrayList<Integer> tempList, int[] nums) {
        if(tempList.size()==nums.length)list.add(new ArrayList<>(tempList));
        else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i]))continue;
                tempList.add(nums[i]);
                backtrack(list,tempList,nums);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
