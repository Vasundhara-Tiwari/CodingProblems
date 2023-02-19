package solutions;

import java.util.ArrayList;

public class LinkedListCycle{
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public boolean hasCycle(ListNode head) {
        ArrayList<ListNode> al = new ArrayList<>();
        ListNode current = head;
        while(current != null){
            if(al.contains(current.next)){
                return true;
            }
            al.add(current.next);
            current = current.next;
        }
        return false;
    }
}
