package 树;

/**
 * @ClassNameDeepTree
 * @Description
 * @Author
 * @Date2020/8/19 12:27
 * @Version V1.0
 **/
//求二叉搜搜索树得最大深度---------递归
public class DeepTree {
    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(4);
        System.out.println(maxDeep(treeNode));
    }

    public static int maxDeep(TreeNode treeNode) {
        return treeNode == null ? 0 : Math.max(maxDeep(treeNode.left), maxDeep(treeNode.right)) + 1;
    }


//    // Java
//    public void recur(int level, int param) {
//        // terminator
//        if (level > MAX_LEVEL) {
//            // process result
//            return;
//        }
//        // process current logic
//        process(level, param);
//        // drill down
//        recur( level: level + 1, newParam);
//        // restore current status
//
//    }
}
