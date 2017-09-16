/**
 * Created by DELL on 2017/9/11.
 *
 * @author MJY
 */
public class 二维数组中查找 {
    public boolean Find(int target, int [][] array) {
        if (array==null) return false;
        int height=array.length;
        if(height==0) return false;
        int width=array[0].length;
        if (width==0)return false;
        for (int i = 0; i < height; i++) {
            if(target>array[i][width-1])continue;
            if (target<array[i][0])return  false;
            if(target>=array[i][0]&&target<=array[i][width-1])
            {
                for (int j = 0; j < width; j++) {
                    if (array[i][j]==target)return  true;
                }
                continue;
            }
            return false;
        }
        return false;
    }
    public boolean Find_better(int target, int [][] array){
        if (array==null) return false;
        int height=array.length;
        if(height==0) return false;
        int width=array[0].length;
        if (width==0)return false;
        int hIndex=height-1,wIndex=0;
        while (hIndex>=0&&wIndex<height)
        {
            if (array[hIndex][wIndex]==target)return true;
            if (array[hIndex][wIndex]>target){
                hIndex--;
                continue;
            }
            if (array[hIndex][wIndex]<target)
            {
                wIndex++;
                continue;
            }
        }
        return false;
    }
}
