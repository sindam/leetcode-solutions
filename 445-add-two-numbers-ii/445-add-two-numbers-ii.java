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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        Stack<Integer> s1 = new Stack<Integer>();
        while(l1 != null){
            s1.push(l1.val);
            l1 = l1.next;
        }
        
        Stack<Integer> s2 = new Stack<Integer>();
        while(l2 != null){
            s2.push(l2.val);
            l2 = l2.next;
        }
        
        int carry = 0;
        ListNode node = new ListNode(0);
        ListNode curr = node;
        
        while( !s1.isEmpty() || !s2.isEmpty() || carry != 0){
            
            int x = (!s1.isEmpty()) ? s1.pop() : 0;
            int y = (!s2.isEmpty()) ? s2.pop() : 0;
            int sum = x+y+carry;
            carry = sum/10;
            curr.val = sum%10;
            
            ListNode head = new ListNode(0);
            head.next = curr;
            curr = head;
            
        }
        
        return curr.val == 0 ? curr.next : curr ;
    }
}