package solutions;

/**
 * Created by Vasundhara Tiwari
 * On 01-03-2022 at 21:12
 */

public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode resultHead = new ListNode();
        int carry = 0;
        int flag = 0;

        while(l1 != null && l2 != null){
            ListNode newNode;

            if(l1.val + l2.val + carry < 10){
                newNode = new ListNode(l1.val + l2.val + carry);
                carry = 0;
            }
            else {
                newNode = new ListNode((l1.val + l2.val + carry) % 10);
                carry = (l1.val + l2.val + carry) / 10;
            }


            if(flag++ == 0){
                resultHead = newNode;
            }
            else {
                ListNode current = resultHead;

                while(current.next != null){
                    current = current.next;
                }

                current.next = newNode;
            }

            l1 = l1.next;
            l2 = l2.next;

        }

        return resultHead;
    }
}