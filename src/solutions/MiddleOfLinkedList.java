package solutions;

public class MiddleOfLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int size = 1;
        ListNode ans;
        while(current.next != null){
            current = current.next;
            size++;
        }

        return ans;
    }
}
