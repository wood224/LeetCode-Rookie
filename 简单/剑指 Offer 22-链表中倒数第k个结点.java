class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        while(fast != null){
            if(k > 0){
                k--;
            }else{
                head = head.next;
            }
            fast = fast.next;
        }
        return head;
    }
}
