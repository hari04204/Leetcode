/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode cur = headA;
        while(cur!=null){
            set.add(cur);
            cur = cur.next;
        }
        cur = headB;
        while(cur!=null && !set.contains(cur)){
            cur = cur.next;
        }
        return cur;
    }
}