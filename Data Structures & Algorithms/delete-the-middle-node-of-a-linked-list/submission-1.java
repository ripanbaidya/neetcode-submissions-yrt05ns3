/**
 * Optimal solution
 * time - O(n), to iterate over the list
 * space - O(1) 
 */
class Solution {
  public ListNode deleteMiddle(ListNode head) {
    if (head == null || head.next == null)
      return null;
    
    ListNode fast = head;
    ListNode slow = head;
    ListNode slowPrev = head;
    
    while (fast != null && fast.next != null) {
      slowPrev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }

    slowPrev.next = slowPrev.next.next;

    return head;
  }
}