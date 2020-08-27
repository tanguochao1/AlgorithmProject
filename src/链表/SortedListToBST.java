package 链表;

/**
 * @ClassNameSortedListToBST
 * @Description
 * @Author
 * @Date2020/8/18 15:00
 * @Version V1.0
 **/
//给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树。
//
//本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
//给定的有序链表： [-10, -3, 0, 5, 9],
//
//一个可能的答案是：[0, -3, 9, -10, null, 5], 它可以表示下面这个高度平衡二叉搜索树：

public class SortedListToBST {
    public static void main(String[] args) {

    }

    //
//    public TreeNode sortedListToBST(ListNode head) {
//        if(head == null) return null;
//        else if(head.next == null) return new TreeNode(head.val);
//        ListNode pre = head;
//        ListNode p = pre.next;
//        ListNode q = p.next;
//        //找到链表的中点p
//        while(q!=null && q.next!=null){
//            pre = pre.next;
//            p = pre.next;
//            q = q.next.next;
//        }
//        //将中点左边的链表分开
//        pre.next = null;
//        TreeNode root = new TreeNode(p.val);
//        root.left = sortedListToBST(head);
//        root.right = sortedListToBST(p.next);
//        return root;
//    }
    public TreeNode sortedListToBST(ListNode head) {
        return buildTree(head, null);
    }

    public TreeNode buildTree(ListNode left, ListNode right) {
        if (left == right) {
            return null;
        }
        ListNode mid = getMedian(left, right);
        TreeNode root = new TreeNode(mid.val);
        root.left = buildTree(left, mid);
        root.right = buildTree(mid.next, right);
        return root;
    }

    public ListNode getMedian(ListNode left, ListNode right) {
        ListNode fast = left;
        ListNode slow = left;
        while (fast != right && fast.next != right) {
            fast = fast.next.next;//快指针每次走两步
            slow = slow.next;//慢指针每次走一步
        }
        return slow;
    }
}
