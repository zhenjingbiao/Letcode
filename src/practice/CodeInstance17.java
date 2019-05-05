package practice;//
//输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）

public class CodeInstance17 {

    public static void main(String[] args) {
        TreeNode treeNodeA = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(2);
        TreeNode treeNode6 = new TreeNode(2);
        treeNodeA.left = treeNode2;
        treeNodeA.right = treeNode3;
        TreeNode treeNodeB = new TreeNode(1);
        treeNodeB.left = treeNode2;
        treeNodeB.right = treeNode3;
        treeNode3.left = treeNode5;
        treeNode3.right = treeNode6;
        System.out.println(hasSubTree(treeNodeB, treeNodeA));


    }

    //是否有子树
    public static boolean hasSubTree(TreeNode node1, TreeNode node2) {
        boolean isHasSubTree = false;
        if (node1 != null && node2 != null) {
            if (node1.value == node2.value) {
                isHasSubTree = isSubTree(node1, node2);
            }
            if (!isHasSubTree) {
                isHasSubTree = hasSubTree(node1.left, node2);
            }
            if (!isHasSubTree) {
                isHasSubTree = hasSubTree(node1.right, node2);
            }
        }

        return isHasSubTree;
    }

    public static boolean isSubTree(TreeNode node1, TreeNode node2) {
        if (node1 == null) return node2 == null;
        if (node2 == null) return true;
        if (node1.value != node2.value) {
            return false;
        }
        return isSubTree(node1.left, node2.left) && isSubTree(node1.right, node2.right);
    }

    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int value;

        public TreeNode(int value) {
            this.value = value;
        }
    }


}
