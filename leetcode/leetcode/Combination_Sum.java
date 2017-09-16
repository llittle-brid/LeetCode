import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by DELL on 2017/9/16.
 *
 * @author MJY
 */
public class Combination_Sum {
    /**
     * 给一个数组，找出数组相加为target的集合
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists=new LinkedList<>();
        Arrays.sort(candidates);
        backtrack(lists,new ArrayList<>(),candidates,target,0);
        return lists;
    }
    private void backtrack(List<List<Integer>> lists,List<Integer> templist,int[] candidates,int target,int start)
    {
        if (target<0)return;
        if(target==0) lists.add(new LinkedList<>(templist));
        for (int i = start; i < candidates.length; i++) {
            templist.add(candidates[i]);
            backtrack(lists,templist,candidates,target-candidates[i],i);
            templist.remove(templist.size()-1);
        }
    }
}
