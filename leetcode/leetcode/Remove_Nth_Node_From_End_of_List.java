/**
 * Created by DELL on 2017/9/10.
 *
 * @author MJY
 */
public class Remove_Nth_Node_From_End_of_List {

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int listSize=0,count=0;
        ListNode sizeTest=head,resHead=new ListNode(0);
        resHead.next=head;
        while (sizeTest!=null)
        {
            listSize++;
            sizeTest=sizeTest.next;
        }
        ListNode lastNode=resHead,nowNode=resHead.next;
        while (true){
            count++;
            if (listSize-count==n)
                break;
            else {
                count++;
                lastNode=nowNode;
                nowNode=nowNode.next;
            }
        }
        lastNode.next=nowNode.next;
        return resHead.next;
    }

    /**
     * 快慢指针，设
     * <---y---><------x------>
     * ——————————————
     * <----x+1----><---y-1--->
     * 快指针移动到x+1位置，剩下流程为y-1即为x y的交点的前一个位置
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd_1(ListNode head, int n) {

        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;

        //Move fast in front so that the gap between slow and fast becomes n
        for(int i=1; i<=n+1; i++)   {
            fast = fast.next;
        }
        //Move fast to the end, maintaining the gap
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //Skip the desired node
        slow.next = slow.next.next;
        return start.next;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        removeNthFromEnd_1(head,2);
    }
}
