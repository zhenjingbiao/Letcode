import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//题目：从尾到头打印链表
public class CodeInstance03 {
    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.node = node2;
        node2.node = node3;
        node3.node = node4;
        List<Integer> list = printListFromTailToHead(node1);
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) {
            return null;
        }
        ArrayList<Integer> printList = new ArrayList<>();
        Stack<Integer> nodeStack = new Stack<>();
        while (listNode!= null) {
            nodeStack.push(listNode.value);
            listNode = listNode.node;
        }
        while (!nodeStack.isEmpty()){
            int node=nodeStack.pop();
            printList.add(node);
        }
        return printList;


    }

    /*
     * 链表节点的打印
     * */
    static class ListNode {
        int value;
        ListNode node = null;

        ListNode(int val) {
            this.value = val;
        }
    }

}
