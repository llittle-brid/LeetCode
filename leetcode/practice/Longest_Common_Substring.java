import java.util.Scanner;

/**
 * Created by DELL on 2017/9/4.
 *
 * @author MJY
 */
public class Longest_Common_Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=new String[2];
        s[0]=sc.nextLine();s[1]=sc.nextLine();
        if(s[0].length()>s[1].length()){
            String temp=s[0];
            s[0]=s[1];
            s[1]=temp;
        }
        char[] s0_char=s[0].toCharArray();
        char[] s1_char=s[1].toCharArray();
        int[] count=new int[s[1].length()];
        for(int start=0,end=s[0].length()-1;start<s[1].length();start++){
            int[] temp=new int[s[0].length()];
            int tempN=0;
            for(int j=start;j<=end;j++){
                if((s1_char[j]==s0_char[j-start])||(s1_char[j]==s0_char[j-start]+32)||(s1_char[j]==s0_char[j-start]-32)){//忽略大小写
                    temp[tempN]+=1;
                }else{
                    tempN++;
                }
                int max_temp=temp[0];
                for(int k=1;k<temp.length;k++){
                    if(temp[k]>max_temp){
                        max_temp=temp[k];
                    }
                }
                count[start]=max_temp;
            }
            if(end>=s[1].length()-1){
                end=s[1].length()-1;
            }else{
                end++;
            }
        }
        //找出统计数组中最大的数字
        int max=count[0];
        for(int k=1;k<count.length;k++){
            if(count[k]>max){
                max=count[k];
            }
        }
        //输出结果
        System.out.println(max);
    }
}
