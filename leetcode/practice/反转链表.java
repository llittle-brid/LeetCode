import java.util.Stack;

/**
 * Created by DELL on 2017/9/14.
 *
 * @author MJY
 */
public class 反转链表 {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

        public static ListNode ReverseList(ListNode head) {
        if (head==null)return head;
            ListNode tail = new ListNode(1);
            Stack<ListNode> stack = new Stack<>();
            while (head != null) {
                stack.push(head);
                head = head.next;
            }
            tail.next = stack.peek();
            ListNode last = stack.pop();
            while (!stack.isEmpty()) {
                last.next = stack.pop();
                last = last.next;
//                System.out.println(last.val);
            }
            //头指针循环引用
            last.next=null;
            return tail.next;
        }


    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head=ReverseList(head);
        System.out.println(head.val);
    }
}
