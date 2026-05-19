class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null)
            return null;
        int len = getLength(head);
        int nth = len - n;

        if (len == n)
            return head.next;
        
        ListNode cur = head;
        for (int i = 0; i < nth-1; i ++) {
            cur = cur.next;
        }

        cur.next = cur.next.next;

        return head;
    }

    private int getLength(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len ++;
        }

        return len;
    }
}
