import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by DELL on 2017/9/16.
 *
 * @author MJY
 */
public class 字符串的排列 {
    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str==null||str.length()==0)return res;
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars.toString());
        backtrack(res, chars, new LinkedList<>(),new boolean[chars.length]);
        return res;
    }

    private static void backtrack(ArrayList<String> res, char[] str, List tempList, boolean[] used) {
        if (tempList.size() == str.length)
        {
            String tempString="";
            for (int i = 0; i < tempList.size(); i++) {
                tempString+= tempList.get(i);
            }
            res.add(tempString);
        }
        else
        for (int i = 0; i < str.length; i++) {
            if (used[i] || i > 0 && str[i] == str[i - 1] && !used[i - 1]) continue;
            tempList.add(str[i]);
            used[i] = true;
            backtrack(res,str,tempList,used);
            used[i] = false;
            tempList.remove(tempList.size()-1);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> res=Permutation("abc");
        for (String i:res)
        {
            System.out.println(i);
        }
    }
}
