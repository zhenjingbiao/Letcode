package practice;

//题目：
//输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
// 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
public class CodeInstance04 {
    public static void main(String[] args) {

        //TODO   待做
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in =  {4, 7, 2, 1, 5, 3, 8, 6};
        System.out.println(reConstructBinaryTree(pre, in));

    }

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre != null && pre.length > 0 && in != null && in.length == pre.length) {
            return reConstruct(pre, 0, pre.length - 1, in, 0, in.length - 1);
        }else {
            return null;
        }
    }

    public static TreeNode reConstruct(int[] pre, int preLeft, int preRight, int[] in, int inLeft, int inRight) {
        if (preLeft > preRight || inLeft > inRight) {
            System.out.println("preLeft="+preLeft+"preRight"+preRight+"inLeft="+inLeft+"inRight"+inRight);
            return null;
        }
        TreeNode node = new TreeNode(pre[preLeft]);
        for (int i = inLeft; i <= inRight; i++) {
            if (pre[preLeft] == in[i]) {
                node.left = reConstruct(pre, preLeft + 1, i - inLeft + preLeft, in, inLeft , i-1);
                node.right = reConstruct(pre, i - inLeft + preLeft + 1, preRight, in, i + 1, inRight);
                System.out.println("遍历到"+in[i]);
                break;
            }
        }
        return node;
    }


    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.value = val;
            System.out.println("新建一次TreeNode");
        }
    }

}
