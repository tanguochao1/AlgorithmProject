package 剑指offer题库;

import 链表.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/*从尾到头反过来打印出每个结点的值。*/
/*1使用递归
* 2头插法构建逆序链表
* 3使用栈 放入栈 后进先出*/
public class PrintNodeList {

    public ArrayList<Integer> printList(ListNode treeNode) {
        Stack<Integer> stack = new Stack<>();
        while (treeNode != null) {
            stack.add(treeNode.val);
            treeNode = treeNode.next;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        while (!stack.isEmpty())
            ret.add(stack.pop());
        return ret;
    }
}
