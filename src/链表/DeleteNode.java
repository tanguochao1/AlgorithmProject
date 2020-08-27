package 链表;/*
 *@author tanguochao
 *@description
 *@date
 */

import 树.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class DeleteNode {
    /*在知道同类数据的数量范围且不超过静态内存容许值时用数组，编程简单快速。
    当你处理的同类数据的数据量未知时，或者数据量超过静态数组定义范围时，就要用链表。
            ＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
    普通数组在用户的静态数据空间中分配内存，链表在操作系统的堆中动态分配内存。*/


//    请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
//
//    现有一个链表 -- head = [4,5,1,9]，它可以表示为:
//    输入: head = [4,5,1,9], node = 5
//    输出: [4,1,9]
//    解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.


    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        int[] s = {4, 5, 1, 9};
        for (int i = 0; i < s.length; i++) {
            listNode.add(s[i]);
        }
        deleteNode(listNode, 2).print();
    }

    public static ListNode deleteNode(ListNode node, int n) {
//        将原来的下一个节点给废掉。
        if (n == 0) {
            return node;
        }
        node.val = node.next.val;
        node.next = node.next.next;
        return node;
    }

}
