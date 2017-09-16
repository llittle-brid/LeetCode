import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by DELL on 2017/9/11.
 *
 * @author MJY
 */
public class 从尾到头打印链表 {
    ArrayList<Integer> arrayList=new ArrayList<Integer>();
    class ListNode{
        int val;
        ListNode next = null;
    }
    public void traverse(ListNode listNode)
    {if (listNode!=null)
        listNode=listNode.next;
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode!=null){
       printListFromTailToHead(listNode.next);
        arrayList.add(listNode.val);
        }
        return arrayList;
    }
}
