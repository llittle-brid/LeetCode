import java.util.Scanner;

/**
 * Created by DELL on 2017/9/4.
 * 美团笔试第一题
 * @author MJY
 */
public class Int_To_Binary_Different {
    public static int getRes(String a,String b)
    {
        int aIndex=0,bIndex=0,count=0;
        while (true)
        {
            if (aIndex<a.length()&&bIndex<b.length())
            {
                if(a.charAt(aIndex)!=b.charAt(bIndex))
                    count++;
                aIndex++;
                bIndex++;
                continue;
            }
            if(aIndex>=a.length()&&bIndex<b.length())
            {
                bIndex++;
                count++;
            }
            else if (bIndex>=b.length()&&aIndex<a.length())
            {
                aIndex++;
                count++;
            }
            else if(aIndex>=a.length()&&bIndex>=b.length())
            {
                break;
            }

        }return count;
    }

    public static void main(String[] args) {
        Scanner fin=new Scanner(System.in);
        int x=fin.nextInt(),y=fin.nextInt();
        String xBinary= Integer.toBinaryString(x),yBinary=Integer.toBinaryString(y);
        System.out.println(xBinary);
        System.out.println(yBinary);
        System.out.println(getRes(xBinary,yBinary));
    }
}
