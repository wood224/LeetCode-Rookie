public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        int la = 0, lb = 0;
        ListNode pa = headA, pb = headB;
        while(pa != null){
            pa = pa.next;
            la ++;
        }
        while(pb != null){
            pb = pb.next;
            lb ++;
        }
        boolean flag = false;
        if(pa == pb){
            flag = true;
        }
        if(flag){
            int n;
            if(la > lb){
                n = la - lb;
                pa = headA;
                pb = headB;
            }else{
                n = lb - la;
                pa = headB;
                pb = headA;
            }
            while(n != 0){
                pa = pa.next;
                n--;
            }
            while(pa != pb){
                pa = pa.next;
                pb = pb.next;
            }
            return pa;
        }
        return null;
    }
}
