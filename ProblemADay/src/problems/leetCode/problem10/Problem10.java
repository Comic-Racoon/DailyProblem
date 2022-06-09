package problems.leetCode.problem10;

public class Problem10 {
    /*


    Given the head of a singly linked list, return the middle node of the linked list.
    If there are two middle nodes, return the second middle node.



    Example 1:


    Input: head = [1,2,3,4,5]
    Output: [3,4,5]
    Explanation: The middle node of the list is node 3.
    Example 2:


    Input: head = [1,2,3,4,5,6]
    Output: [4,5,6]
    Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

*/


    public static void main(String[] args) {

        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);

        Solution s = new Solution();

        System.out.println(s.middleNode(root).val);

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class Solution {
        public ListNode middleNode(ListNode head) {

            ListNode slow = head;
            ListNode fast = head;


            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;

        }
    }
}
