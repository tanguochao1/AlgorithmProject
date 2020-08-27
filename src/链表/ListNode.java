package 链表;/*
 *@author tanguochao
 *@description
 *@date
 */

public class ListNode {

    //为方便使用，变量使用public
    public int val;   //存放数据的变量
    public ListNode next;   //存放结点的变量，默认为null

//    public ListNode(int x) {
//        val = x;
//    }
//    ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    //添加结点
    public void add(int newdata) {

        ListNode newNode = new ListNode(newdata);    //创建一个结点
        if (this.next == null) {
            this.next = newNode;
        } else {
            this.next.add(newdata);
        }
    }

    //输出结点的值
    public void print() {
        System.out.print(this.val + "-->");
        if (this.next != null) {
            this.next.print();
        }
    }

}
