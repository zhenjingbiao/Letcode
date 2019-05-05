package practice;//
//从上往下打印出二叉树的每个节点，同层节点从左至右打印。

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CodeInstance22 {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(6);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(3);
        treeNode1.leftNode = treeNode2;
        treeNode1.rightNode = treeNode3;
        treeNode2.leftNode = treeNode4;
        treeNode2.rightNode = treeNode5;
        treeNode3.rightNode = treeNode5;
        CodeInstance22 instance22 = new CodeInstance22();
        nodeVals.add(treeNode1.val);
        instance22.print(treeNode1);


    }

    /**
     * 递归方式
     */
    static List<Integer> nodeVals = new ArrayList<>();

    public void print(TreeNode root) {
        printTree2(root);
        for (Integer val : nodeVals) {
            System.out.println(val);
        }
    }


    public void printTree(TreeNode treeNode) {
        if (treeNode != null) {
            if (treeNode.leftNode != null) {
                nodeVals.add(treeNode.leftNode.val);
            }
            if (treeNode.rightNode != null) {
                nodeVals.add(treeNode.rightNode.val);
            }
            printTree(treeNode.leftNode);
            printTree(treeNode.rightNode);
        }

    }

    //非递归版本
    public void printTree2(TreeNode treeNode) {
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(treeNode);
        while (!queue.isEmpty()){
            TreeNode node=queue.poll();
            if(node.leftNode!=null){
                queue.offer(node.leftNode);
                nodeVals.add(node.leftNode.val);
            }
            if(node.rightNode!=null){
                queue.offer(node.rightNode);
                nodeVals.add(node.rightNode.val);
            }
        }

    }

    static class TreeNode {
        int val;
        TreeNode leftNode;
        TreeNode rightNode;

        public TreeNode(int val) {
            this.val = val;
        }
    }


}
