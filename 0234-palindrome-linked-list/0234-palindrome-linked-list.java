/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode fast = head;
        ListNode slow = head;
        Stack<Integer> stk = new Stack<>();
        while(fast!=null && fast.next!=null){
            stk.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast!=null) slow = slow.next;
        while(slow!=null){
            if(stk.isEmpty() || slow.val!=stk.pop()) return false;
            slow=slow.next;
        }
        return true;
    }
}