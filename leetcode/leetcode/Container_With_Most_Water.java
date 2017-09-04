/**
 * Created by DELL on 2017/8/17.
 *
 * @author MJY
 */

/**
 * result:O(n)的复杂度也超时了，很惊讶
 */
public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int res = 0,left=0,right=height.length-1;
        while (left>right)
        {
            res=Math.max(res,Math.min(height[left],height[right])*(right-left));
            if(height[left]>height[right])
                right--;
            else left++;
        }
      return res;
    }

    /**
     * 优化思路，从左往右走的left指针，若i处的值为n,则i+j处的值小于n，则可以跳过
     * @param height
     * @return
     */
    public int maxArea_better(int[] height) {
        int L = height.length, left = 0, right = L-1;
        int max = 0;
        while(left<right) {
            int leftMax = height[left], rightMax = height[right];

            int candidate = (right-left) * (leftMax<rightMax ? leftMax : rightMax);
            max = candidate > max ? candidate : max;

            if(height[left]<=height[right])
                while(left<right && height[left]<=leftMax) ++left;
            else
                while(right>left && height[right]<=rightMax) --right;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Container_With_Most_Water().maxArea(new int[]{1,2,1}));
    }
}
