import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by DELL on 2017/9/14.
 *
 * @author MJY
 */
public class 调整数组顺序使奇数位于偶数前面 {
    public static void reOrderArray(int [] array) {
        if(array==null||array.length<2)return ;
        List<Integer> oList=new LinkedList<>(),jList=new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0)oList.add(array[i]);
            else jList.add(array[i]);
        }
        jList.addAll(oList);
        for (int i = 0; i < jList.size(); i++) {
            array[i]=jList.get(i);
        }
    }

    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5,6,7};
        reOrderArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
