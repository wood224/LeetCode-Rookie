class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null){
            if(k > 0){
                k--;
            }else{
                slow = slow.next;
            }
            fast = fast.next;
        }
        return slow;
    }
}
