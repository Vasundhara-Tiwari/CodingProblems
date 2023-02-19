package solutions;

public class RemoveLinkedListElements{
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        ListNode current = head.next;
        ListNode prev = head;
        while(current != null){
            if(current.val == val){
                prev.next = current.next;
                current = current.next;
            }
            else{
                current = current.next;
                prev = prev.next;
            }
        }
        if(head.val == val){
            head = head.next;
        }
        return head;
    }
}
