public class LinkedListCycle{
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
