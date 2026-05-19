class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    if (head == null || head.next == null)
      return null;

    ListNode left = head;
    ListNode leftBack = head;
    ListNode right = head;

    for (int i = 0; i < n; i++) {
      right = right.next;
    }

    if (right == null)
      return head.next;


    while (right != null) {
      leftBack = left;
      left = left.next;
      right = right.next;
    }

    leftBack.next = leftBack.next.next;

    return head;
  }
}