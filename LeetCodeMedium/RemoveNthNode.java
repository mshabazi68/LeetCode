/**
  *Given the head of a linked list, remove the nth node from the end of the list and return its head.
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode myDummy = new ListNode(0);
        myDummy.next = head; 
        
        ListNode jumpNode = myDummy;
        ListNode slowNode = myDummy;
        
        for ( int i=1; i<= n+1; i++){
            jumpNode =jumpNode.next;
        }
        while (jumpNode != null){
            slowNode =slowNode.next;
            jumpNode = jumpNode.next;
            
        }
        
        slowNode.next = slowNode.next.next; 
        return myDummy.next;
    }
}
