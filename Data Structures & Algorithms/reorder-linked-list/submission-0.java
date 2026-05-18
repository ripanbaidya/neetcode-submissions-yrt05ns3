// Optimal
class Solution {
  public void reorderList(ListNode head) {
    // find middle
    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // reverse second half
    ListNode second = slow.next;
    slow.next = null;

    ListNode revHead = reverseList(second);

    // reorder list
    ListNode cur = head;    
    while (revHead != null) {
        ListNode curNext = cur.next;
        ListNode revNext = revHead.next;

        cur.next = revHead;
        revHead.next = curNext;

        cur = curNext;
        revHead = revNext;
    }
  }

  private ListNode reverseList(ListNode head) {
    ListNode prev = null;

    while (head != null) {
      ListNode front = head.next;
      head.next = prev;
      prev = head;
      head = front;
    }

    return prev;
  }
}
