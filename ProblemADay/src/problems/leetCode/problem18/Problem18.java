package problems.leetCode.problem18;

public class Problem18 {
    /*Populating Next Right Pointers in Each Node
    * You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:

    struct Node {
        int val;
        Node *left;
        Node *right;
        Node *next;
     }
    Populate each next pointer to point to its next right node.
    If there is no next right node, the next pointer should be set to NULL.

    Initially, all next pointers are set to NULL.
*/


    // ref :- https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node(){}

        public Node(int val){
            this.val =val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            this.val = _val;
            this.left = _left;
            this.right = _right;
            this.next = _next;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1,new Node(2),new Node(3),null);
        root.left.left = new Node(4);
        root.right.right = new Node(5);

        Solution s = new Solution();

        Node ans = s.connect(root);

    }

    static class Solution {
        public Node connect(Node root) {

            Node head = root ;

            while(head != null && head.left != null){

                Node pointer = head;

                while(true){

                    pointer.left.next = pointer.right;

                    if (pointer.next == null ){
                        break ;
                    }

                    pointer.right.next = pointer.next.left;

                    pointer = pointer.next;

                }
                head = head.left;

            }
            return root;
        }
    }


}
