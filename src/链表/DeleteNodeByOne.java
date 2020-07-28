package 链表;/*
 *@author tanguochao
 *@description
 *@date 2019/12/23
 */

public class DeleteNodeByOne {
//    给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        int[] s = {4, 5, 1, 9};
        for (int i = 0; i < s.length; i++) {
            listNode.add(s[i]);
        }
        removeNthFromEnd(listNode,2);
        System.out.println(listNode.next.val);
        System.out.println(listNode.next.next.val);
        System.out.println(listNode.next.next.next.val);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // 特殊情况
        if (n == 0) return head;
        // 特殊
        if (head == null) return null;
        // 绝对此时 n=1
        if (head.next == null) return null;

        // 开始
        int count = 0;
        ListNode node = head;
        ListNode node2 = null;

        while (node != null) {
            node = node.next;
            count++;
            // 初始化指针
            if (count > n) {
                node2 = node2 == null ? head : node2.next;
            }

            if (node == null) {
                // 比如移除最后一个节点, 此时count才到n ,还没有初始化第二个指针, 需要直接返回
                if (node2 == null) {
                    return head.next;
                }
                // 当年node指针和 node2 指针差距 = n+1 其实 ,因为我们node迭代了一次,实际上可以看做是n
                node2.next = node2.next.next;
            }
        }
        return head;
    }
}
