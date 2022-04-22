class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode h = null;
        ListNode p = head;
        while(p != null){
            ListNode next = p.next;
            p.next = h;
            h = p;
            p = next;
        }
        return h;
    }
}
