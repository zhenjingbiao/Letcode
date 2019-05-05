package practice;//输入一个链表，反转链表

public class CodeInstance15 {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(7);
        ListNode node5 = new ListNode(8);
        ListNode node6 = new ListNode(9);
        ListNode node7 = new ListNode(10);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        ListNode inverseNode=getInverseNode(node1);
       // System.out.println(inverseNode.value);
        while (inverseNode!=null){
            System.out.println(inverseNode.value);
            inverseNode=inverseNode.next;
        }
    }

    private static ListNode getInverseNode(ListNode node) {
        ListNode preNode = null;
        ListNode nextNode=null;
       /* while (preNode.next!= null) {
            nextNode = preNode.next;//先把第二个节点保存下来
            preNode.next=nextNode.next;//让第一个节点指向第三个节点
            nextNode.next = preNode;//让第二个节点指向第一个节点
            preNode=preNode.next;
            System.out.println(preNode.value+"----------------------------");

        }*/

        while (node!=null){
            nextNode=node.next;
            node.next=preNode;
            preNode=node;
            node=nextNode;
        }
        return preNode;
    }

    static class ListNode {
        public int value;
        public ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

    }

}
