/**
 * Created by DELL on 2017/8/16.
 *
 * @author MJY
 */
public class ZigZag_Conversion {
    /**
     * 第一行和最后一行，为每次(2n-2),中间行每次取n
     * Submission Details：beats 5%
     * 惊讶的变化，把String+=""，换成数组char[i]=,结果战胜了99.97，猜测是因为数组是连续的空间，赋值会很快，如果s+=""，相当于new了
     * 一个新的字符串，每次都会重新开辟新的空间，并且伴随着垃圾回收，所以很慢
     * @param s 字符串
     * @param numRows 行数
     * @return
     */
    public String convert(String s, int numRows) {
        if(numRows==1)return s;
        int strlen=s.length(),resultIndex=0;
        char[] result = new char[strlen];
        int index=0;
        for(int i=0;i<numRows;i++)
        {
            index=i;
            if(i==0||i==numRows-1)//第一行和最后一行
            {
                while(index<strlen)
                {
                    result[resultIndex++]+=s.charAt(index);
                    index+=2*numRows-2;
                }
            }
            else{
                while(index<strlen)
                {
                    result[resultIndex++]+=s.charAt(index);
                  if((index+2*(numRows-i-1))<s.length())
                  {
                      result[resultIndex++]+=s.charAt(index+2*(numRows-i-1));
                      index+=2*numRows-2;
                  }
                  else{
                      break;
                  }

                }
            }
        }
        return result.toString();
    }

    /**
     *关于代码优化:常用的返回字符串长度的函数，可以在函数开始用变量替代
     * @param s
     * @param numRows
     * @return
     */
    public String convert_better(String s, int numRows) {
        int strLen = s.length();
        char[] result = new char[strLen];

        if (numRows == 1) {
            return s;
        }

        int delta = (numRows - 1) * 2;

        int start = 0;
        int resultIndex = 0;

        while(start < strLen){
            result[resultIndex++] = s.charAt(start);
            start += delta;
        }

        for (int i = 1; i <= numRows - 2; i++) {
            start = i;
            int delta_a = delta - i * 2;
            int delta_b = i * 2;

            boolean a = true;

            while(start < strLen){
                result[resultIndex++] = s.charAt(start);
                start += a ? delta_a : delta_b;
                a = !a;
            }
        }

        start = numRows - 1;
        while(start < strLen){
            result[resultIndex++] = s.charAt(start);
            start += delta;
        }

        return new String(result);
    }

    public static void main(String[] args) {
        System.out.println(new ZigZag_Conversion().convert("abcdefghijk",1));
    }
}
