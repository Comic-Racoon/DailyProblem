package problems.leetCode.problem21;

public class problem21 {
    /*Merge Two Sorted Lists
    You are given the heads of two sorted
    linked lists list1 and list2.

    Merge the two lists in a one sorted list.
    The list should be made by splicing together
    the nodes of the first two lists.

    Return the head of the merged linked list.

*/

    //ref:- https://leetcode.com/problems/merge-two-sorted-lists/submissions/
    public static class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        Solution s = new Solution();

        ListNode node  = s.mergeTwoLists(list1, list2);


        while(node!=null){
            System.out.print(node.val + "->");
            node = node.next;
        }


    }
    static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            // edge
            if(list1 == null || list2 == null){

                if(list1 == null){
                    return list2;
                }
                else {
                    return list1;
                }
            }
            ListNode dummy = new ListNode(-1);
            ListNode previous = dummy;

            ListNode p1 = list1;
            ListNode p2 = list2;


            while(p1 != null && p2 != null){

                if(p1.val < p2.val){
                    previous.next = p1;
                    p1=p1.next;
                }
                else{
                    previous.next = p2;
                    p2 = p2.next;
                }

                previous = previous.next;
            }

            previous.next = p1!=null ? p1:p2;

            return dummy.next;
        }
    }

}
