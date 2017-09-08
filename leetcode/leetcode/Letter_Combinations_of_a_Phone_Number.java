import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by DELL on 2017/8/19.
 *
 * @author MJY
 */
public class Letter_Combinations_of_a_Phone_Number {
    static String[] mapping=new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        //queue：FIFO
        LinkedList<String> res=new LinkedList<>();
        res.add("");
        for (int i = 0; i < digits.length(); i++) {
            int x= digits.charAt(i)-'0';
            while (res.peek().length()==i)
            {
                String t=res.remove();
                for (char s:mapping[x].toCharArray())
                {
                    res.add(t+s);
                }
            }
        }
        return res;
    }

    public List<String> letterCombinations_recursion(String digits)
    {
        LinkedList<String> res=new LinkedList<>();
        combination("",digits,0,res);
        return res;
    }

    public void combination(String t,String digits, int offset, List<String> res)
    {
        if(offset==digits.length())
            return;
        for (char s:mapping[offset].toCharArray())
        {

            combination(t+s,digits,0+1,res);
        }
    }

    public static void main(String[] args) {
        System.out.println('3'-'0');
    }
}
