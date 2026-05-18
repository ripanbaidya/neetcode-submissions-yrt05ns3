/**
 * brute force
 * 
 * time - O(n) + O(n/2)
 * counting the length of ll is take O(n), then we are iterating approx half of ll again to get 
 * the previous node of the middle node which is taking another O(n/2)
 * 
 * space - O(1) 
 */
class Solution {
  public ListNode deleteMiddle(ListNode head) {
    if (head == null || head.next == null)
      return null;

    int len = getLength(head);
    int mid = len/2;

    ListNode temp = head;
    for (int i = 0; i < mid-1; i ++) {
      temp = temp.next;
    }

    temp.next = temp.next.next;

    return head;
  }

  private int getLength(ListNode head) {
    int len = 0;
    while (head != null) {
      len ++;
      head = head.next;
    }
    
    return len;
  }
}