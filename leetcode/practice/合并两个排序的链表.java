/**
 * Created by DELL on 2017/9/14.
 *
 * @author MJY
 */
public class 合并两个排序的链表 {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

        public static ListNode Merge(ListNode list1, ListNode list2) {
            ListNode head = new ListNode(10086);
            ListNode res=head;
            while (list1 != null || list2 != null) {
                if (list1 == null) {
                    head.next = list2;
                    list2=list2.next; 
                }
                else if (list2==null){
                    head.next=list1;
                    list1=list1.next; 
                }
                else {
                    if (list1.val > list2.val) {
                        head.next = list2;
                        list2 = list2.next;
                    } else {
                        head.next = list1;
                        list1 = list1.next;
                    }
                }

                head=head.next;
            }
            return res.next;
        }

    public static void main(String[] args) {
        ListNode list1=new  ListNode(1);
        list1.next=new  ListNode(3);
        list1.next.next=new  ListNode(5);
        ListNode list2=new  ListNode(2);
        list2.next=new  ListNode(4);
        list2.next.next=new  ListNode(6);
        Merge(list1,list2);
    }

}
