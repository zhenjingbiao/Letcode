package practice;//
//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。

public class CodeInstance16 {

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
        ListNode nodeA = new ListNode(2);
        ListNode nodeB = new ListNode(4);
        ListNode nodeC = new ListNode(5);
        ListNode nodeD = new ListNode(6);
        ListNode nodeE = new ListNode(10);
        ListNode nodeF = new ListNode(12);
        ListNode nodeG = new ListNode(14);
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = nodeF;
        nodeF.next = nodeG;
        // ListNode mergeNode = Merge(node1, nodeA);
        //ListNode mergeNode = merge2(node1, nodeA);
       // ListNode mergeNode = merge3(node1, nodeA);
        ListNode mergeNode = merge4(node1, nodeA);
        while (mergeNode != null) {
            System.out.println(mergeNode.value);
            mergeNode = mergeNode.next;
        }

    }

    public static ListNode merge4(ListNode node1,ListNode node2){
        if(node1==null)return node2;
        if (node2==null)return node1;
        ListNode mergeNode;
        ListNode currNode;
        if(node1.value<=node2.value){
            mergeNode=currNode=node1;
            node1=node1.next;
        }else {
            mergeNode=currNode=node2;
            node2=node2.next;
        }
        while (node1!=null&&node2!=null){
            if(node1.value<=node2.value){
                currNode.next=node1;
                node1=node1.next;
            }else {
                currNode.next=node2;
                node2=node2.next;
            }
            currNode=currNode.next;
        }
        if(node1==null){
            currNode.next=node2;
        }else {
            currNode.next=node1;
        }
        return mergeNode;
    }

    /**
     * 错误代码
     */
    public static ListNode Merge(ListNode node1, ListNode node2) {
        if (node1 == null) return node2;
        if (node2 == null) return node1;
        ListNode mergeListNode;
        if (node1.value < node2.value) {
            mergeListNode = new ListNode(node1.value);
            node1 = node1.next;
        } else {
            mergeListNode = new ListNode(node2.value);
            node2 = node2.next;
        }
        while (node1 != null && node2 != null) {
            if (node1.value >= node2.value) {
                mergeListNode.next = new ListNode(node2.value);
                node2 = node2.next;
            } else {
                mergeListNode.next = new ListNode(node1.value);
                node1 = node1.next;
            }
            mergeListNode = mergeListNode.next;
        }
        if (node1 == null) {
            mergeListNode.next = node2;
        } else {
            mergeListNode.next = node1;
        }

        return mergeListNode;
    }

    public static ListNode merge2(ListNode node1, ListNode node2) {
        if (node1 == null) return node2;
        if (node2 == null) return node1;
        ListNode mergeListNode;
        ListNode currentNode;
        if (node1.value < node2.value) {
            mergeListNode = currentNode = node1;
            node1 = node1.next;
        } else {
            mergeListNode = currentNode = node2;
            node2 = node2.next;
        }
        while (node1 != null && node2 != null) {
            if (node1.value >= node2.value) {
                currentNode.next = node2;
                node2 = node2.next;
            } else {
                currentNode.next = node1;
                node1 = node1.next;
            }
            currentNode = currentNode.next;
        }
        if (node1 == null) {
            currentNode.next = node2;
        } else {
            currentNode.next = node1;
        }

        return mergeListNode;
    }

    public static ListNode merge3(ListNode node1, ListNode node2) {
        if (node1 == null) return node2;
        if (node2 == null) return node1;
        if (node1.value >= node2.value) {
            node2.next = merge3(node1, node2.next);
            return node2;
        } else {
            node1.next = merge3(node1.next, node2);
            return node1;
        }
    }

    static class ListNode {
        public int value;
        public ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

    }


}
