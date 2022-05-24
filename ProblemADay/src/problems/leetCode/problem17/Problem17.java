package problems.leetCode.problem17;

import java.util.Stack;

public class Problem17 {

    /*

    You are given two binary trees root1 and root2.

    Imagine that when you put one of them to cover the other,
    some nodes of the two trees are overlapped while the others
     are not. You need to merge the two trees into a new binary tree.
     The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of the new tree.

    Return the merged tree.

    Note: The merging process must start from the root nodes of both trees.

    */

    //ref :- https://leetcode.com/problems/merge-two-binary-trees/

      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.left.left = new TreeNode(5);
        root1.right = new TreeNode(2);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.left.right = new TreeNode(4);
        root2.right = new TreeNode(3);
        root2.right.right = new TreeNode(7);

        Solution s = new Solution();

        TreeNode ans = s.mergeTrees(root1, root2);



    }


    static class Solution{
          public TreeNode mergeTrees( TreeNode root1, TreeNode root2){
              if(root1 == null){
                  return root2;
              }

              Stack<TreeNode[]> stack = new Stack<>();
              stack.push(new TreeNode[] {root1, root2});

              while(!stack.empty()){

                  TreeNode [] t = stack.pop();

                  if(t[0] == null || t[1] == null){
                      continue;
                  }

                  t[0].val += t[1].val;

                  if(t[0].left == null){
                      t[0].left = t[1].left;
                  }else{
                      stack.push(new TreeNode[]{ t[0].left, t[1].left});
                  }
                  if(t[0].right == null){
                      t[0].right = t[1].right;
                  }else{
                      stack.push(new TreeNode[]{ t[0].right, t[1].right});
                  }

              }
              return root1;
          }
    }

}
