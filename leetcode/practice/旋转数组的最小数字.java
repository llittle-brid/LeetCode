/**
 * Created by DELL on 2017/9/11.
 *
 * @author MJY
 */
public class 旋转数组的最小数字 {
    public static int minNumberInRotateArray(int [] array) {
        if(array==null||array.length==0)return 0;
        int left=0,right=array.length,mid,temp=array[0];
        while (left<right){
            mid=(left+right)/2;
//            System.out.println(array[mid]);
            if (array[mid]>temp)left=mid+1;
            else right=mid;
        }
        return array[left];
    }

    public static void main(String[] args) {
        System.out.println(minNumberInRotateArray(new int[]{3,4,5,1,2}));
    }
}
