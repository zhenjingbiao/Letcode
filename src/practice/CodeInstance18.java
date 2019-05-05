package practice;//
//操作给定的二叉树，将其变换为源二叉树的镜像。
//二叉树的镜像定义：源二叉树
//    	    8
//    	   /  \
//    	  6   10
//    	 / \  / \
//    	5  7 9 11
//    	镜像二叉树
//    	    8
//    	   /  \
//    	  10   6
//    	 / \  / \
//    	11 9 7  5

import java.util.Stack;

public class CodeInstance18 {

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



    }
    /**
     * 递归方法
     * */
    public static void mirror(TreeNode node){
        if(node==null)return;
        if(node.left==null&&node.right==null)return;
        TreeNode temp=node.left;
        node.left=node.right;
        node.right=temp;
        mirror(node.left);//可以加上判空条件
        mirror(node.right);
    }

    /**
     * 非递归版本
     * */

    public static void mirror2(TreeNode node){
        if (node==null)return;
        Stack<TreeNode>nodeStack=new Stack<>();
        nodeStack.push(node);
        while (!nodeStack.isEmpty()){
            TreeNode treeNode=nodeStack.pop();
            if(treeNode.right!=null||treeNode.left!=null){
                TreeNode temp=treeNode.left;
                treeNode.left=treeNode.right;
                treeNode.right=temp;
            }

            if(treeNode.left!=null){
                nodeStack.push(treeNode.left);
            }
            if(treeNode.right!=null){
                nodeStack.push(treeNode.right);
            }
        }
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
