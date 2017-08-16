import java.util.Stack;

/**
 * Created by DELL on 2017/8/13.
 *
 * @author MJY
 */
public class Valid_Parentheses {

    /**
     * 非常巧妙的将符号的对应符号压栈
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        if(s==null||s.length()%2==1)return false;
        Stack<Character> stack=new Stack();
        for(int i=0;i<s.length();i++)
        {
            switch (s.charAt(i))
            {
                case '(' :stack.push(')');break;
                case '{' :stack.push('}');break;
                case '[' :stack.push(']');break;
                //需要考虑stack一开始为空的情况
                default: if(stack.isEmpty()||stack.pop()!=s.charAt(i))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
