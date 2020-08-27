package 链表;/*
 *@author tanguochao
 *@description
 *@date
 */

import java.util.HashSet;
import java.util.Set;

public class HasCycle {
//    环形链表


    public static void main(String[] args) {

    }

    //hash表
//    public boolean hasCycle(ListNode head) {
//        Set<ListNode> nodesSeen = new HashSet<>();
//        while (head != null) {
//            if (nodesSeen.contains(head)) {
//                return true;
//            } else {
//                nodesSeen.add(head);
//            }
//            head = head.next;
//        }
//        return false;
//    }
    //双指针
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
