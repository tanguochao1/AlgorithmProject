package 树;


import java.util.ArrayList;
import java.util.List;

public class TreeNodeDefinition {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(4);
//        int[] s = {4, 5, 1, 9};
//        for (int i = 0; i < s.length; i++) {
//            node.add(s[i]);
//        }
       System.out.println(preorderTraversal(node));
    }

    //前序遍历-根左右   中序-左根右  后序-左右根
    //递归
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    private static void preorder(TreeNode root, List<Integer> res) {
        if (root != null) {
            res.add(root.val);
            preorder(root.left, res);
            preorder(root.right, res);
        }
    }
}
