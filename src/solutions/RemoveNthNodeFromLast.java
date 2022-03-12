package solutions;

/**
 * Created by Vasundhara Tiwari
 * On 13-03-2022 at 00:00
 */

public class RemoveNthNodeFromLast {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        int size = 0;
        while(current != null){
            current = current.next;
            size++;
        }
        if(n == size){
            return head.next;
        }
        int nodeRemove = size - n;
        current = head;
        int i=1;
        while(i < nodeRemove){
            current = current.next;
            i++;
        }
        current.next = current.next.next;
        return head;
    }
}