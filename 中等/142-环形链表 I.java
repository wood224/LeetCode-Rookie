public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        boolean flag = false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        if(flag){
            slow = head;
            while(fast != slow){
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        }
        return null;
    }
}
