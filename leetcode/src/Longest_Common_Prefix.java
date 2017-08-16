/**
 * Created by DELL on 2017/8/12.
 *
 * @author MJY
 */
public class Longest_Common_Prefix {
    /**
     * 水平扫描
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
            if(strs==null||strs.length==0)return "";
            String temp=strs[0];
            for(int i=0;i<strs.length;i++)
            {
                while (strs[i].indexOf(temp)!=0){
                    temp=temp.substring(0,temp.length()-1);
                }
            }
            return temp;
        }

    /**
     * 竖直扫描
     * @param strs
     * @return
     */
    public String longestCommonPrefix_1(String[] strs) {
        if(strs==null||strs.length==0)return "";
        for(int i=0;i<strs[0].length();i++)
        {
            char c=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(i==strs[j].length()||strs[j].charAt(i)!=c)
                {
                    strs[0].substring(0,i);
                }
            }
        }
        return  strs[0];
    }


}
