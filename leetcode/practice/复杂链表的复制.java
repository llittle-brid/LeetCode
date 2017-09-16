/**
 * Created by DELL on 2017/9/14.
 *
 * @author MJY
 */
public class 复杂链表的复制 {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null)
            return null;

        //开辟一个新节点
        RandomListNode pClonedHead=new RandomListNode(pHead.label);
        pClonedHead.next = pHead.next;
        pClonedHead.random = pHead.random;

        //递归其他节点
        pClonedHead.next=Clone(pHead.next);

        return pClonedHead;
    }


}
