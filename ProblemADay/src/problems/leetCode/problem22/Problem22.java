package problems.leetCode.problem22;

public class Problem22 {
    /*Reverse a link list
    Given the head of a singly linked list,
    reverse the list, and return the reversed list.

*/
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);

        Solution s = new Solution();

        ListNode result = s.reverseList(root);

        while(result != null){
            System.out.print(result.val + "->");
            result = result.next;
        }
    }
    static class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode current = head;
            ListNode prev = null;

            while(current != null){
                ListNode temp = current.next;
                current.next = prev;
                prev = current;
                current = temp;
            }
            return prev;
        }
    }
}
