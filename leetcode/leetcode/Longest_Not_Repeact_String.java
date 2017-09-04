import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by DELL on 2017/8/14.
 * Time complexity : O(2n)=O(n)O(2n) = O(n)O(2n)=O(n)
 *
 * @author MJY
 */
public class Longest_Not_Repeact_String {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }

    /**
     * 使用Map进行优化，key保存值，value保存下一次正确移动的指针值
     * 优化上一种解法i小步移动的问题
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring_Optimized(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, ans = 0;//j为当前移动值，i表示下一次正确移动值
        while (j < s.length()) {
            if (map.containsKey(s.charAt(j)))
                i = Math.max(i, map.get(s.charAt(j)));
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), i + 1);
        }
        return ans;
    }


    public static void main(String[] args) {
        new Longest_Not_Repeact_String().lengthOfLongestSubstring("abcc");
    }
}
