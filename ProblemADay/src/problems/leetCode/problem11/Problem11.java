package problems.leetCode.problem11;


public class Problem11 {
    /*Given the head of a linked list, remove the nth node
    from the end of the list and return its head.

    Example 1:
    Input: head = [1,2,3,4,5], n = 2
    Output: [1,2,3,5]
    Example 2:

    Input: head = [1], n = 1
    Output: []*/

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        root.next.next.next.next.next = new ListNode(6);

        int count = 0;

        while(root!=null){
            count++;
            root = root.next;
        }

        ListNode temp = root;

        int num = 0;
        while(num <= count - 2){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        while (root != null){
            System.out.println(root.val);
            root = root.next;
        }

    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) { this.val = val; this.next = next; }
    }
}
