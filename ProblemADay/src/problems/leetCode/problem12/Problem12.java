package problems.leetCode.problem12;

public class Problem12 {
    /*Given the head of a linked list, remove the nth node from
    the end of the list and return its head.
    Example 1:
    Input: head = [1,2,3,4,5], n = 2
    Output: [1,2,3,5]

    Example 2:

    Input: head = [1], n = 1
    Output: []
    Example 3:

    Input: head = [1,2], n = 1
    Output: [1]*/

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        Solution s = new Solution();

        s.removeNthFromEnd(head, 2);

        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }

    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    static class Solution {

        public ListNode removeNthFromEnd(ListNode head, int n) {

            int counter = 0;//ptr

            ListNode root = head;

            // counts how many nodes are in the list

            while (root != null){
                counter++;
                root = root.next;
            }

            int loop = counter - n;

            if (loop == 0){  ////case 1: if the node to be removed is the first one


                head = head.next;
                return head;
            }


            else{
                // case 2: the node to be removed is not the first one
                int count = 1;
                ListNode trailer = head;
                root = head.next;
                while (count < loop){
                    trailer = root;
                    root = root.next;
                    count++;
                } //use 2 pointers to keep track of the list
                trailer.next = root.next;
                return head;

            }

        }
    }
}
