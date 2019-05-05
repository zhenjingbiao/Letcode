package practice;//输入一个链表，输出该链表中倒数第k个结点。

public class CodeInstance14 {

    public static void main(String[] args) throws Exception {

        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(3);
        ListNode node3=new ListNode(5);
        ListNode node4=new ListNode(7);
        ListNode node5=new ListNode(8);
        ListNode node6=new ListNode(9);
        ListNode node7=new ListNode(10);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        System.out.println(getInverseKNode(node1,10).value);
    }
    private static ListNode getInverseKNode(ListNode node,int k) throws Exception {
        if(node==null)return null ;
        ListNode node1=node;
        int num=0;
        while (node!=null&&num<k){
            node=node.next;
            ++num;
        }
        System.out.println("----------------"+num);
        if(num<k)throw new Exception(){

        };
        while (node!=null){
            node=node.next;
            node1=node1.next;
        }
        return node1;

    }

    static class ListNode{
        public int value;
        public ListNode next;
        public  ListNode(int value){
            this.value=value;
        }

    }

}
