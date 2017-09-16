/**
 * Created by DELL on 2017/9/11.
 *
 * @author MJY
 */
public class 跳台阶 {
    public int JumpFloor(int target) {
       return  getRes(target);
    }
    public int getRes(int target)
    {
        if(target==1)return 1;
        if(target==2)return 2;
        return getRes(target-1)+getRes(target-2);
    }
}
